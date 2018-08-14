package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: wang
 * @Date: 2018/8/7 11:13
 * @Description: 断路器 需要的错误返回信息
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
