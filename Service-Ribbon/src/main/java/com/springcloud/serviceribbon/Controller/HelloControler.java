package com.springcloud.serviceribbon.Controller;

import com.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable String name){
        return helloService.hiService(name);
    }
}
