package com.test.threaddemo;

/**
 * @author 宁超
 * @date 2019/5/25 - 9:35
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        CreateRunnable creatrunable = new CreateRunnable();
        Thread thread = new Thread(creatrunable);
        thread.start();
    }
}

class CreateRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++)
        {
            System.out.println("run()i--" + i);
        }
    }
}
