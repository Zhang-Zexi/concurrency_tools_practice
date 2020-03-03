package com.zzx.imooccache.computable;

/**
 * @ClassName Computable
 * @Description
 * @Author zhangzx
 * @Date 2020/3/2 19:40
 * Version 1.0
 **/
public interface Computable<A, V> {

    V compute(A arg) throws Exception;

}
