package com.hcl.springcloud.controller;

import com.hcl.springcloud.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/2.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        StringBuilder sb = new StringBuilder();
        //for (int i = 0;i < 10; i++) {
            sb.append(helloService.hiService( name ));
            sb.append("<br/>");
        //}
        return sb.toString();
    }
}
