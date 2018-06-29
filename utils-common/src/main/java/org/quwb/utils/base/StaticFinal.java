package org.quwb.utils.base;

import java.io.IOException;

/**
 * static+final：
 * 1、静态常量，编译期常量，编译时就确定值。（Java代码执行顺序，先编译为class文件，在用虚拟机加载class文件执行）
 * 2、放于方法区中的静态常量池。
 * 3、在编译阶段存入调用类的常量池中
 * 4、如果调用此常量的类不是定义常量的类，那么不会初始化定义常量的类，因为在编译阶段通过常量传播优化，已经将常量存到调用类的常量池中了
 * 5、常量传播与常量折叠
 **/
public class StaticFinal {
    static {
        System.out.println("StaticFinal的静态块执行");
    }

    public StaticFinal() {
        System.out.println("StaticFinal的构造方法执行");
    }

    public static final String HELLO = "hello world";
}

class NotInit {
    public static void main(String[] args) throws IOException {
        //经过编译优化，静态常量HELLO已经存到NotInit类自身常量池中，不会加载StaticFinal
        System.out.println(StaticFinal.HELLO);
        String abc = new String("wenbin");
        abc.intern();

        System.in.read();
    }
}
