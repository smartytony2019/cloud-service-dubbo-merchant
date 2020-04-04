package com.xinbo.cloud.service.dubbo.merchant;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Collections;

/**
 * @author 熊二
 * @date 2020/4/2 21:14
 * @desc file desc
 */

@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.xinbo.cloud")
@MapperScan(basePackages = "com.xinbo.cloud.common.mapper")
public class CloudDubboMerchantApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDubboMerchantApplication.class, args);
    }

}
