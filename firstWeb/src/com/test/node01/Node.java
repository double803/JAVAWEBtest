package com.test.node01;

/**
 * 链结点，相当于是车厢
 * @author 宁超
 * @date 2019/5/6 - 19:42
 */
public class Node {
    //数据域
    public long data;
    //指针域
    public Node next;

    public Node previous;
    public Node(long value)
    {
        this.data = value;
    }

    /**
     * 显示
     */
    public void display()
    {
        System.out.print(data + " ");
    }
}
