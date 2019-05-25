package proxy.cglib_demo;

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
 * @description 描述:Cglib动态代理基本原理是代理类继承被代理类，代理类是被代理类的子类，然后代理类重写父类的方法达到增强的目的
 *                  Cglib不能代理final类，因为它不能被继承
 * @date 2019/4/20
 */
public class Test {
    public static void main(String[] args) {
        //得到代理类对象
        XiaoMing instance = (XiaoMing) CglibInstanceFactory.getInstance();

        //调用方法
        instance.liuxue();
        System.out.println("--------------------------");
        instance.zhaoduixiang();
    }
}
