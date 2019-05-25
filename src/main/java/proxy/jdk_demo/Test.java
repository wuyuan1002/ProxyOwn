package proxy.jdk_demo;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理和CGLib动态代理的对比：
 * 1、CGLib所创建的动态代理对象在实际运行时候的性能要比JDK动态代理高不少，有研究表明，大概要高10倍；
 *
 * 2、但是CGLib在创建对象的时候所花费的时间却比JDK动态代理要多很多，有研究表明，大概有8倍的差距；
 *
 * 3、因此，对于singleton的代理对象或者具有实例池的代理，因为无需频繁的创建代理对象，所以比较适合采用CGLib动态代理，反正，则比较适用JDK动态代理。
 *
 * 4、JDK动态代理是实现了被代理对象的接口，Cglib是继承了被代理对象。
 *
 * 5、JDK动态代理使用反射完成，也使用了动态生成字节码技术。而CGLib使用了动态生成字节码技术。
 *
 * @author wuyuan
 * @version 1.0
 * @className: Test
 * @description 描述:JDK的动态代理  --- 被代理类必须实现一个接口，动态生成的代理类也同样会实现这个接口
 *                                    增强类必须实现InvocationHandler接口并重写invoke方法，在这个方法内完成对被代理类的增强
 *                                    代理类实现了和被代理类相同的接口，并在自己的方法内调用了增强类的invoke方法完成了对被代理类的增强
 *
 *                  缺点：1.运行时会生成很多代理对象，耗费内存资源，在编译时期无法确定所耗费内存大小。
 *                       2.被代理类必须实现接口
 * @date 2019/4/20
 */
public class Test {
    public static void main(String[] args) {

        //得到需要代理的对象
        XiaoMing xiaoMing = new XiaoMing();

        /*
         * 动态生成代理对象，该对象实现了People接口
         * 动态生成的代理对象中有一个parents类的实例，代理对象的zhaoduixiang方法内调用了parents实例的invoke方法
         */
        People proxy = (People) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{People.class}, new Parents(xiaoMing));

        //调用代理对象的方法 --- 代理类的这个方法调用了增强类的invoke方法
        proxy.zhaoduixiang();
    }

}
