package com.xinbo.cloud.service.dubbo.merchant.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import com.xinbo.cloud.common.domain.common.UserInfo;
import com.xinbo.cloud.common.dto.ActionResult;
import com.xinbo.cloud.common.dto.ResultFactory;
import com.xinbo.cloud.common.service.api.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 熊二
 * @date 2020/4/2 22:38
 * @desc file desc
 */

@Slf4j
@RestController
public class MerchantController {

    @Reference(version = "1.0.0", mock = "com.xinbo.cloud.common.service.mock.UserInfoServiceMock")
    private UserInfoService userInfoService;

    @GetMapping("checkUser")
    public ActionResult checkUser() {
        log.error("-----------------------------------  服务成功 -----------------------------------------------");
        UserInfo user = userInfoService.getUser();
        if(user == null || user.getUserId() == null) {
            return ResultFactory.fallback();
        }
        return ResultFactory.success(user);
    }
}
