package com.devjackie.app.service.impl;

import com.devjackie.app.service.AutowiredService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015-02-20.
 */
@Service
public class AutowiredServiceBImpl implements AutowiredService {
    @Override
    public String autowiredMethod1() {
        return "This is AutowiredServiceB";
    }

    @Override
    public String autowiredMethod2() {
        return null;
    }
}
