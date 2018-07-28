package com.example.yongjie.designpattern.proxy.statics;

/**
 * 上层调用类
 */
public class Client {

    public static void main(String[] args) {
        IMobileOperator mobileOperator = new MobileOperator();
        Proxy proxy = new Proxy(mobileOperator);
        proxy.recharge(50);

    }
}
