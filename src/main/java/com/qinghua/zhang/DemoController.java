package com.qinghua.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: demo controller
 * @author: zhangqinghua
 * @date: 2017/8/31
 */
@EnableAutoConfiguration
@Controller
public class DemoController {

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "ok";
    }

    @RequestMapping("demoIn")
    public String demo() {
        return "demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class, args);
    }

}
