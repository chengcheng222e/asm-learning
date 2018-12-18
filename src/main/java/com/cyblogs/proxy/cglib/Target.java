package com.cyblogs.proxy.cglib;

/**
 * Created with proxy-learning
 * Description：
 * User：chenyuan
 * Date：2018/12/18
 * Time：7:21 PM
 */
public class Target {

    public String execute() {
        String message = "----------test()----------";
        System.out.println(message);
        return message;
    }

    
}
