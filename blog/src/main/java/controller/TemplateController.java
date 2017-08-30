package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaopenghui on 2017/8/28.
 * 模板controller
 */
@Controller
@EnableAutoConfiguration
public class TemplateController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
//        System.out.println("这是新版本1.1");
        System.out.println("这是新版本1.3");
        return "Hello World!";
    }
}
