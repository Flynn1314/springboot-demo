package com.huofei.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * date: 2020/11/4 20:53
 * author: huofei
 * version: 1.0
 */
@Configuration
@MapperScan("com.huofei.demo.mapper")
@MapperScan("com.mp.typehandler.mapper")
public class MybatisPlusConfig {

}
