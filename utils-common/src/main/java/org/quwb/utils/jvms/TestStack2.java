package org.quwb.utils.jvms;

import org.junit.jupiter.api.Test;

public class TestStack2 {
    private int count = 0;

    public void recursion(long a, long b, long c) throws InterruptedException {
        long d = 0, e = 0, f = 0; //占用了栈的空间
        count++;
        recursion(a, b, c);
    }

    @Test
    public void testStack() {
        try {
            recursion(1L, 2L, 3L);
        } catch (Throwable e) {
            System.out.println("deep of stack is " + count);
            //e.printStackTrace();
        }
    }
}
