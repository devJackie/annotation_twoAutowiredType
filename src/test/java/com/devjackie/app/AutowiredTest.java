package com.devjackie.app;

import com.devjackie.app.service.AutowiredService;
import com.devjackie.app.service.impl.AutowiredServiceAImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2015-02-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:test-mvc-dispatcher-servlet.xml"
})
public class AutowiredTest {

        @Autowired
        @Qualifier("ServiceA")
        AutowiredService autowiredServiceA;

        @Test
        public void whenTwoAutowiredType() {

                if(autowiredServiceA instanceof AutowiredService){
                        assertThat(autowiredServiceA.autowiredMethod1(), is("This is AutowiredServiceA"));
                }else{
                        assertThat(autowiredServiceA.autowiredMethod1(), is("This is not AutowiredServiceA"));
                }
        }
}
