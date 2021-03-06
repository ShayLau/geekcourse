package com.github.shaylau.geekCourse.resvoler;

import com.github.shaylau.geekCourse.api.RpcfxRequest;
import com.github.shaylau.geekCourse.api.RpcfxResolver;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


@Service
public class DemoResolver implements ApplicationContextAware, RpcfxResolver {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    @Override
    public Object resolve(Class t) {
        return applicationContext.getBean(t);
    }

}
