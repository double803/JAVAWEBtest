package com.test.data;

/**
 * @author 宁超
 * @date 2019/5/5 - 19:56
 */
public class BubbleSort {

    //冒泡
    public static void sort(long[] arr)
    {
        long temp = 0;
        for(int i =0;i<arr.length - 1;i++)
        {
            for (int j= arr.length - 1;j >i;j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    //冒泡
     public static void sorta(long[] arr)
     {
        long temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    public  static  void sortSelect(long[] arr)
    {
        int k = 0;
        long temp;
        for (int i= 0; i < arr.length - 1;i ++)
        {
            k = i;
            for (int j = i; j < arr.length;j++)
            {
                if (arr[j] < arr[k])
                {
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
    //插入排序
    public static void sortInsert(long[] arr)
    {
        long temp = 0;
        for (int i =1; i < arr.length ;i ++)
        {
            temp = arr[i];
            int j = i;
            while (j > 0 && arr[j] >= temp)
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
