package com.springcloud.sericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class SericeFeignApplication {


    /**
     * feign默认集成了Ribbon
     * 使用feign
     * 只要创建一个接口并注解
     * 实现负载均衡**/

    public static void main(String[] args) {
        SpringApplication.run(SericeFeignApplication.class, args);
    }

}
