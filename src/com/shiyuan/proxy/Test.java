package com.shiyuan.proxy;

/**
 * @Author SHI YUAN
 * @DATE 2022/4/3 12:35 AM
 * @Version 1.0
 * @Desc
 */
public class Test {
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JdkProxyInterface jdkProxyInterface = MapperProxyFactory.newInstance(JdkProxyInterface.class);
        String song = jdkProxyInterface.sayHello("song");
        System.out.println(song);
    }
}
