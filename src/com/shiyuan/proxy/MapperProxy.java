package com.shiyuan.proxy;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author SHI YUAN
 * @DATE 2022/4/3 12:25 AM
 * @Version 1.0
 * @Desc
 * T 目标接口
 * 接口代理 统一包装类
 */
public class MapperProxy<T> implements InvocationHandler, Serializable {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("call method " + method);
        System.out.println("call args: " + toString(args));
        // 根据方法名字 执行不同的逻辑
        return "xiao ";
    }

    private String toString(Object[] args){
        StringBuilder sb = new StringBuilder("");
        for (Object arg : args) {
            sb.append(arg.toString());
        }
        return sb.toString();
    }
}
