package com.example.yongjie.designpattern.proxy.statics;

/**
 * 代理类
 */
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
