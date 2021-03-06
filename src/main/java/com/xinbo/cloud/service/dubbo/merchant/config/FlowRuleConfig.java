package com.xinbo.cloud.service.dubbo.merchant.config;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @author 熊二
 * @date 2020/4/3 22:53
 * @desc file desc
 */
@Slf4j
@Component
public class FlowRuleConfig {

    /**
     * dubbo访问限流
     */
    @Bean
    private static void setMerchantServiceFlowRule() {
        log.info("--------------------------- dubbo访问限流  ---------------------------");
        FlowRule flowRule = new FlowRule();
        flowRule.setResource("com.xinbo.cloud.common.service.api.MerchantServiceApi");
        flowRule.setCount(3);
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setLimitApp("default");
        FlowRuleManager.loadRules(Collections.singletonList(flowRule));
    }

}
