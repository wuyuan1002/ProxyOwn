package proxy.jdk_demo;

import java.lang.reflect.Proxy;

/**
 * JDK��̬�����CGLib��̬����ĶԱȣ�
 * 1��CGLib�������Ķ�̬���������ʵ������ʱ�������Ҫ��JDK��̬����߲��٣����о����������Ҫ��10����
 *
 * 2������CGLib�ڴ��������ʱ�������ѵ�ʱ��ȴ��JDK��̬����Ҫ��ܶ࣬���о������������8���Ĳ�ࣻ
 *
 * 3����ˣ�����singleton�Ĵ��������߾���ʵ���صĴ�����Ϊ����Ƶ���Ĵ�������������ԱȽ��ʺϲ���CGLib��̬������������Ƚ�����JDK��̬����
 *
 * 4��JDK��̬������ʵ���˱��������Ľӿڣ�Cglib�Ǽ̳��˱��������
 *
 * 5��JDK��̬����ʹ�÷�����ɣ�Ҳʹ���˶�̬�����ֽ��뼼������CGLibʹ���˶�̬�����ֽ��뼼����
 *
 * @author wuyuan
 * @version 1.0
 * @className: Test
 * @description ����:JDK�Ķ�̬����  --- �����������ʵ��һ���ӿڣ���̬���ɵĴ�����Ҳͬ����ʵ������ӿ�
 *                                    ��ǿ�����ʵ��InvocationHandler�ӿڲ���дinvoke�������������������ɶԱ����������ǿ
 *                                    ������ʵ���˺ͱ���������ͬ�Ľӿڣ������Լ��ķ����ڵ�������ǿ���invoke��������˶Ա����������ǿ
 *
 *                  ȱ�㣺1.����ʱ�����ɺܶ������󣬺ķ��ڴ���Դ���ڱ���ʱ���޷�ȷ�����ķ��ڴ��С��
 *                       2.�����������ʵ�ֽӿ�
 * @date 2019/4/20
 */
public class Test {
    public static void main(String[] args) {

        //�õ���Ҫ����Ķ���
        XiaoMing xiaoMing = new XiaoMing();

        /*
         * ��̬���ɴ�����󣬸ö���ʵ����People�ӿ�
         * ��̬���ɵĴ����������һ��parents���ʵ������������zhaoduixiang�����ڵ�����parentsʵ����invoke����
         */
        People proxy = (People) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{People.class}, new Parents(xiaoMing));

        //���ô������ķ��� --- ����������������������ǿ���invoke����
        proxy.zhaoduixiang();
    }

}
