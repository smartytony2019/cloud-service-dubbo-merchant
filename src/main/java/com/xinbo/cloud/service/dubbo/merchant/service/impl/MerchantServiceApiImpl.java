package com.xinbo.cloud.service.dubbo.merchant.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xinbo.cloud.common.domain.common.Merchant;
import com.xinbo.cloud.common.dto.PageDto;
import com.xinbo.cloud.common.dto.common.MerchantDto;
import com.xinbo.cloud.common.mapper.common.MerchantMapper;
import com.xinbo.cloud.common.service.api.MerchantServiceApi;
import com.xinbo.cloud.common.vo.PageVo;
import com.xinbo.cloud.common.vo.common.MerchantVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author 熊二
 * @date 2020/4/2 23:18
 * @desc file desc
 */

@Service(version = "A1.0.0")
public class MerchantServiceApiImpl implements MerchantServiceApi {


    @Override
    public MerchantDto get(long merchantId) {
        return null;
    }

    @Override
    public MerchantDto getByMerchantCode(String merchantCode) {
        return null;
    }

    @Override
    public PageDto<MerchantDto> getListPage(PageVo<MerchantVo> pageVo) {
        return null;
    }

    @Override
    public boolean add(Merchant merchant) {
        return false;
    }

    @Override
    public boolean update(Merchant merchant) {
        return false;
    }

    @Override
    public boolean delete(int merchantId) {
        return false;
    }

    @Override
    public Map getMyCatDataNode() {
        return null;
    }
}
