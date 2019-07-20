package com.test.TestStack;

/**
 * @author 宁超
 * @date 2019/5/5 - 21:45
 */
public class MyStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack(4);
        ms.push(23);
        ms.push(12);
        ms.push(1);
        ms.push(90);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());
        System.out.println(ms.peek());
        System.out.println(ms.peek());
        while (!ms.isEmpty())
        {
            System.out.print(ms.pop() + ",");
        }
    }
    //底层实现是一个数组
    private long[] arr;
    private  int top;

    MyStack()
    {
        arr = new long[10];
        top = -1;
    }

    /**
     * 代参构造
     */
    MyStack(int maxsize)
    {
        arr = new long[maxsize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int value)
    {
        arr[++top] = value;
    }

    //移除数据
    public long pop()
    {
        return arr[top--];
    }

    //查看数据
    public  long peek()
    {
        return arr[top];
    }

    //判断是否为空
    public boolean isEmpty()
    {
        return  -1 == top;
    }

    //判断是否满了
    public boolean isFull()
    {
        return  top == arr.length - 1;
    }
}
