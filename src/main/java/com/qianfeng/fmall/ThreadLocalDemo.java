package com.qianfeng.fmall;

import com.qianfeng.fmall.goods.bean.WxbGood;

public class ThreadLocalDemo {
    private static ThreadLocal<WxbGood> threadLocal = new ThreadLocal<>();
    //线程1
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
//                WxbGood wxbGood = new WxbGood();
//                wxbGood.getGoodName("千峰java");
//                threadLocal.set(wxbGood);
//                System.out.println("线程1:"+threadLocal.get().getGoodName());
            }
        }).start();
    }
}
