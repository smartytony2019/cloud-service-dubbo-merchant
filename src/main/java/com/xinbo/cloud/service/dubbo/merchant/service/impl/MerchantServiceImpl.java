package com.xinbo.cloud.service.dubbo.merchant.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xinbo.cloud.common.domain.common.Merchant;
import com.xinbo.cloud.common.mapper.common.MerchantMapper;
import com.xinbo.cloud.common.service.api.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 熊二
 * @date 2020/4/2 23:18
 * @desc file desc
 */

@Service(version = "1.0.0")
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantMapper merchantMapper;

    @Override
    public Merchant getMerchant() {
        Merchant merchant = merchantMapper.getByMerchantCode("xb120");
        return merchant;
    }
}
