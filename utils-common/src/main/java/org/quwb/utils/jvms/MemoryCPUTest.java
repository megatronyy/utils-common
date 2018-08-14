/*
 * @(#)MemoryCPUTest.java      2018/8/14
 *
 * 百得利集团拥有完全的版权
 * 使用者必须经过许可
 */
package org.quwb.utils.jvms;

/**
 * 功能：
 *
 * @author twfx7
 * @since JDK 1.8
 */
public class MemoryCPUTest {

    public static void main(String arg[]) throws InterruptedException {
        cpuFix();
    }

    private static void cpuFix() throws InterruptedException {
        // 80%的占有率
        int busyTime = 8;

        // 20%的占有率
        int idelTime = 2;

        // 开始时间
        long startTime = 0;

        while (true) {
            startTime = System.currentTimeMillis();

            // 运行时间
            while (System.currentTimeMillis() - startTime < busyTime) {
                ;
            }

            // 休息时间
            Thread.sleep(idelTime);
        }
    }
}
