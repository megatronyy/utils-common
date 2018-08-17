package org.quwb.utils.base;
/**
 * linux：Top命令
 * 通过实验， 设想只有当前用到了内存才会进RES？

 后面是通过线上问题发现不是如此， 因为如果没有释放的内存，还是在RES的， 比如JDK的没触发，那么内存就一直占用 了RES.  所以内存大小还是可以直接影响到JAVA进程的大小

 JAVA进程内存 = JVM进程内存+heap内存+ 永久代内存+ 本地方法栈内存+线程栈内存 +堆外内存 +socket 缓冲区内存

 linux内存和JAVA堆中的关系

 RES = JAVA正在存活的内存对象大小 + 未回收的对象大小  + 其它

 VIART= JAVA中申请的内存大小，即 -Xmx  -Xms + 其它

 其它 = 永久代内存+ 本地方法栈内存+线程栈内存 +堆外内存 +socket 缓冲区内存 +JVM进程内存

 VIRT：virtual memory usage
 1、进程“需要的”虚拟内存大小，包括进程使用的库、代码、数据等
 2、假如进程申请100m的内存，但实际只使用了10m，那么它会增长100m，而不是实际的使用量
 RES：resident memory usage 常驻内存
 1、进程当前使用的内存大小，但不包括swap out
 2、包含其他进程的共享
 3、如果申请100m的内存，实际使用10m，它只增长10m，与VIRT相反
 4、关于库占用内存的情况，它只统计加载的库文件所占内存大小
 SHR：shared memory
 1、除了自身进程的共享内存，也包括其他进程的共享内存
 2、虽然进程只使用了几个共享库的函数，但它包含了整个共享库的大小
 3、计算某个进程所占的物理内存大小公式：RES – SHR
 4、swap out后，它将会降下来DATA1、数据占用的内存。如果top没有显示，按f键可以显示出来。
 2、真正的该程序要求的数据空间，是真正在运行中要使用的。

 * **/
public class TestOnly {
    public static void main(String[] args) {
        System.out.println("sleep ..");
        try {
            byte[] buf = new byte[1024 * 1024 * 1024];
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
