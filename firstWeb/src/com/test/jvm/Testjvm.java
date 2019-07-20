package com.test.jvm;

/**
 * @author 宁超
 * @date 2019/5/13 - 21:13
 */
public class Testjvm {
    public static void main(String[] args) {
        ClassLoader c= Testjvm.class.getClassLoader();
        while (c!=null)
        {
            System.out.println(c);
            c = c.getParent();
        }
    }
}
