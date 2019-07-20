package com.test.TestStack;

/**
 * @author 宁超
 * @date 2019/5/5 - 22:03
 */
public class MyQueue {
    //底层使用数组
    private long[] arr;
    //有效数据的大小
    private int elements;
    //队头
    private int front;
    //列尾
    private int end;

    public static void main(String[] args) {
        MyQueue mq = new MyQueue(4);
        mq.insert(23);
        mq.insert(45);
        mq.insert(13);
        mq.insert(1);
        System.out.println(mq.isFull());
        System.out.println(mq.isEmpty());
        System.out.println(mq.peek());
        System.out.println(mq.peek());

        while (!mq.isEmpty())
        {
            System.out.print(mq.remove() + ",");
        }
        mq.insert(30);
    }
    /**
     * 默认构造方法
     */
    public MyQueue()
    {
        arr = new long[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    public MyQueue(int maxsize)
    {
        arr = new long[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 添加数据，从队尾插入
     * @param value
     */
    private void insert(long value)
    {
        arr[++end] = value;
        elements++;
    }

    /**
     * 删除数据，从队头删除
     */
    private long remove()
    {
        elements--;
        return arr[front++];
    }

    /**
     * 查看数据，从队头查看
     */
    public long peek()
    {
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    private boolean isEmpty()
    {
        return 0 == elements;
    }

    /**
     * 判断是否满了
     */
    private boolean isFull()
    {
        return elements == arr.length;
    }
}
