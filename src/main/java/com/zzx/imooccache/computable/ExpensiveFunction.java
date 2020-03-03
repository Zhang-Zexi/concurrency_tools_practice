package com.zzx.imooccache.computable;

/**
 * @ClassName ExpensiveFunction
 * @Description
 * @Author zhangzx
 * @Date 2020/3/2 19:44
 * Version 1.0
 **/
public class ExpensiveFunction implements Computable<String, Integer>{

    @Override
    public Integer computer(String arg) throws Exception {
        Thread.sleep(5000);
        return Integer.valueOf(arg);
    }
}
