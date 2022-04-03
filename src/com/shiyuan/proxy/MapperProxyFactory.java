package com.shiyuan.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author SHI YUAN
 * @DATE 2022/4/3 12:30 AM
 * @Version 1.0
 * @Desc 代理工厂类
 */
public class MapperProxyFactory {

    private static Class<?> targetClz;

    public static <T> T newInstance(Class<T> clz){
        targetClz = clz;
        MapperProxy<T> mapperProxy = new MapperProxy<>();
        return newInstance(mapperProxy);
    }

    @SuppressWarnings("unchecked")
    protected static <T> T newInstance(MapperProxy<T> mapperProxy) {
        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { targetClz }, mapperProxy);
    }
}
