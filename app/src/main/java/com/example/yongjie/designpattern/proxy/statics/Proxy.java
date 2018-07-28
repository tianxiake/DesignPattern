package com.example.yongjie.designpattern.proxy.statics;

public class Proxy implements IMobileOperator{

    private IMobileOperator mobileOperator;

    public Proxy(IMobileOperator mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    @Override
    public void recharge(int count) {
        mobileOperator.recharge(count);
    }
}
