package com.mei.meiSpringBootStarterAutoconfigure.service;

import com.mei.meiSpringBootStarterAutoconfigure.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 默认不要放在容器中
 */
public class HelloService {
    @Autowired
    HelloProperties helloProperties;
    public String sayHello(String userName){
        return helloProperties.getPrefix() + ",this is your wife:" + userName + ". Congratulations " + helloProperties.getSuffix();
    }
}
