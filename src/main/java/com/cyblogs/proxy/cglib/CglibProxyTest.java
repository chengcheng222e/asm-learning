package com.cyblogs.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created with proxy-learning
 * Description：
 * User：chenyuan
 * Date：2018/12/18
 * Time：7:23 PM
 */
public class CglibProxyTest {

    public Object createProxy(Class targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }

    public static void main(String rags[]) {
        Target target = new Target();
        CglibProxyTest cglibProxyTest = new CglibProxyTest();
        Target proxyTarget = (Target) cglibProxyTest.createProxy(Target.class);
        String res = proxyTarget.execute();
        System.out.println(res);
    }

}
