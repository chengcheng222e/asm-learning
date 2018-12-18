package com.cyblogs.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with proxy-learning
 * Description：
 * User：chenyuan
 * Date：2018/12/18
 * Time：7:23 PM
 */
public class MyMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(">>>MethodInterceptor start...");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println(">>>MethodInterceptor ending...");
        return "haha";
    }

}
