package com.test.data;

/**
 * @author 宁超
 * @date 2019/5/5 - 20:10
 */
public class TestSort {
    public static void main(String[] args) {
        //创建线程池的方式
        //不建议使用如下几种方式去构建线程
/*        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool();
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool();*/

        long[] arr = new long[5];
        arr[0] = 34;
        arr[1] = 20;
        arr[2] = 15;
        arr[3] = 74;
        arr[4] = 14;
        System.out.print("[");
        for(long num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
        BubbleSort.sortInsert(arr);
        System.out.print("[");
        for(long num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();

    }
}
