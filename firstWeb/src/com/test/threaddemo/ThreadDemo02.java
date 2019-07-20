package com.test.threaddemo;

/**
 * 创建线程
 * @author 宁超
 * @date 2019/5/25 - 8:54
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //1.定义一个类，继承Thread类 重写run方法
        //2.启动线程
        System.out.println("创建线程 main");
        CreateThread createThread = new CreateThread();
        //启动一个线程 是调用start方法而不是run方法，调用run方法相当于主线程执行。
        //注意使用多线程情况，代码不会从上往下进行执行，会同时并行执行
        //createThread.start();
        createThread.start();
        createThread.setName("test01 ");
        System.out.println("启动线程 mian");
        for (int i=0;i<100;i++)
        {
            System.out.println("mian() run()i--" + i);
        }
    }
}

class CreateThread extends Thread
{
    /**
     * 需要线程执行的任务，代码
     */
     public void run()
     {
         for (int i=0;i<100;i++)
         {
             System.out.println("run()i--" + i);
         }
     }
}
