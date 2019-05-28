package com.springcloud.sericefeign.service.impl;

import com.springcloud.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;


@Component   /**注入到ioc容器**/
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry  "+name;
    }
}
