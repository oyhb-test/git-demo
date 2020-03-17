package com.oyhb.git_test.controller;/*
@author hbouyang
@date 2020/3/18 - 0:12
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/{msg}")
    public Object hello(@PathVariable("msg") String msg){
        return msg + "项目经理123";
    }

    //开发人员提交的代码

    //项目经理写的代码

}
