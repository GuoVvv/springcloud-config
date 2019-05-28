package com.springcloud.sericefeign.service;

import com.springcloud.sericefeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric.class)  /**用来指定调用哪个服务**/
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
