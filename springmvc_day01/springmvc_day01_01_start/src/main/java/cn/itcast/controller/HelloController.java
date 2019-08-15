package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 控制器类
@Controller // 把类交给spring ioc容器管理
public class HelloController {
    @RequestMapping(path = "/hello")    // /hello就是sayHello方法的请求路径
    public String sayHello() {
        System.out.println("Hello SpringMvc");
        return "success";
    }

    /**
     * RequestMapping注解
     *
     * @return
     */
    @RequestMapping(value = "/testRequestMapping", params = {"username=heihei"}, headers = {"Accept"})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping注解...");
        return "success";
    }
}
