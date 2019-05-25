package proxy.jdk_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wuyuan
 * @version 1.0
 * @className: Parents
 * @description 描述:小明的父母 --- 增强类
 * @date 2019/4/20
 */
public class Parents implements InvocationHandler {

    /**
     * 代理类需要持有被代理类的实例
     */
    private People son;

    public Parents(People son) {
        this.son = son;
    }

    /**
     * 增强方法 --- 帮助小明找对象，找到对象后帮助小明带孩子
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        /*
         * 代理类调用被代理类的方法
         */
        method.invoke(son, args);


        after();

        return null;
    }

    /**
     * 小明找对象之前父母帮小明做的
     */
    private void before(){
        System.out.println("父母帮助小明找对象");
    }
    /**
     * 小明找到对象之后父母帮小明做的
     */
    private void after(){
        System.out.println("父母帮助小明带孩子");
    }
}
