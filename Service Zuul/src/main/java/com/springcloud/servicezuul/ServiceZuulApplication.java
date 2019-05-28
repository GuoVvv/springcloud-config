package com.springcloud.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy    /**开启zuul的功能**/
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {

    /**
     * Zuul的主要功能是路由转发和过滤器
     * zuul默认和Ribbon结合实现了负载均衡的功能
     * **/
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
