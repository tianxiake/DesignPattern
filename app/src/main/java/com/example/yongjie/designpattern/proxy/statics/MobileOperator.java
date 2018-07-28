package com.example.yongjie.designpattern.proxy.statics;

/**
 * 被代理类
 */
public class MobileOperator implements IMobileOperator{

    @Override
    public void recharge(int count) {
        System.out.println("运营商充值金额:"+count);
    }
}
