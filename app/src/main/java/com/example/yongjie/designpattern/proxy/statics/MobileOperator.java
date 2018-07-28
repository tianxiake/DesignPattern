package com.example.yongjie.designpattern.proxy.statics;

public class MobileOperator implements IMobileOperator{

    @Override
    public void recharge(int count) {
        System.out.println("运营商充值金额:"+count);
    }
}
