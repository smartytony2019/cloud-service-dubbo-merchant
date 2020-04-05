package com.xinbo.cloud.service.dubbo.merchant;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 熊二
 * @date 2020/4/2 21:14
 * @desc file desc
 */
@EnableSwagger2
@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.xinbo.cloud")
@MapperScan(basePackages = "com.xinbo.cloud.common.mapper")
public class CloudDubboMerchantApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDubboMerchantApplication.class, args);
    }

}
