package com.devjackie.app.service.impl;

import com.devjackie.app.service.AutowiredService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015-02-20.
 */
@Service
@Qualifier("ServiceA")
public class AutowiredServiceAImpl implements AutowiredService {
    @Override
    public String autowiredMethod1() {
        return "This is AutowiredServiceA";
    }

    @Override
    public String autowiredMethod2() {
        return null;
    }
}
