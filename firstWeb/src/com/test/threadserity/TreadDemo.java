package com.test.threadserity;

/**
 * 什么是线程不安全
 * 当多个线程同时操作同一个共享的全局变量或静态变量，可能会受到其他线程的干扰，会发生数据冲突问题。
 * 使用synchronized jdk1.5并发宝lock
 * @author 宁超
 * @date 2019/5/25 - 20:00
 */
public class TreadDemo {
    public static void main(String[] args) {
        //线程类一定要是一个实例
        ThreadTrain threadTrain = new ThreadTrain();
        //创建线程
        Thread thread1 = new Thread(threadTrain);
        Thread thread2 = new Thread(threadTrain);
        Thread thread3 = new Thread(threadTrain);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class ThreadTrain implements Runnable{
    //火车票总数
    private int count = 100;
    private Object obj = new Object();
    @Override
    public void run(){
        while (count > 0) {
            try {
                Thread.sleep(40);
            } catch (Exception e) {

            }
            synchronized (obj){
                if(count > 0){
                    System.out.println(Thread.currentThread().getName() + "，出售第" + (100 - count + 1) + "张票");
                    count--;
                }
            }
        }
    }
}