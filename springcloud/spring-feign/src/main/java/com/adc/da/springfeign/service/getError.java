package com.adc.da.springfeign.service;

import org.springframework.stereotype.Component;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2018-09-21
 */
@Component
public class getError implements FeignService{
    @Override
    public String getPort(String name) {
        return name+ "error";
    }
}
