package com.springcloud.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient /**向服务中心注册**/
@EnableHystrix   /**开启Hystrix   断路器**/
@EnableHystrixDashboard   /**断路器仪表盘**/
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean   /**向ioc注入一个bean**/
    @LoadBalanced   /**表明这个restTemplate开启负载均衡功能**/
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
