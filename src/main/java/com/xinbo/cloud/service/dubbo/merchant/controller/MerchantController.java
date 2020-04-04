package com.xinbo.cloud.service.dubbo.merchant.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xinbo.cloud.common.domain.common.Merchant;
import com.xinbo.cloud.common.domain.common.UserInfo;
import com.xinbo.cloud.common.dto.ActionResult;
import com.xinbo.cloud.common.dto.ResultFactory;
import com.xinbo.cloud.common.service.api.UserInfoServiceApi;
import com.xinbo.cloud.common.service.common.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 熊二
 * @date 2020/4/2 22:38
 * @desc file desc
 */

@Slf4j
@RestController
public class MerchantController {

    /* 内部RPC接口 */
    @Reference(version = "1.0.0", mock = "com.xinbo.cloud.common.service.mock.UserInfoServiceMock")
    private UserInfoServiceApi userInfoServiceApi;

    /* 外部RESTFUL接口 */
    @Autowired
    @Qualifier("merchantServiceImpl")
    private MerchantService merchantService;

    @GetMapping("checkUser")
    public ActionResult checkUser() {
        log.error("-----------------------------------  服务成功 -----------------------------------------------");
        UserInfo user = userInfoServiceApi.getUser();
        if(user == null || user.getUserId() == null) {
            return ResultFactory.fallback();
        }
        return ResultFactory.success(user);
    }


    @GetMapping("checkMerchant")
    public ActionResult checkMerchant() {
        List<Merchant> list = merchantService.getAll();
        return ResultFactory.success(list);
    }

}
