package com.test.node01;

import com.test.node.Node;

/**
 * 双端链表
 * @author 宁超
 * @date 2019/5/6 - 19:45
 */
public class  FirstLastLinkList {
    //头结点
    private Node first;
    //尾结点
    private Node last;
    public FirstLastLinkList()
    {
        first = null;
        last = null;
    }

    /**
     * 插入一个结点，在头结点之后进行插入
     */
    public void insertFirst(long value)
    {
        Node node = new Node(value);
        if(isEmpty())
        {
            last = node;
        }
        node.next = first;
        first = node;
    }
    /**
     * 插入一个结点，从尾结点进行插入
     */
    public void insertLast(long value)
    {
        Node node = new Node(value);
        if(isEmpty())
        {
            first = node;
        }else{
            last.next = node;
        }
        last = node;
    }
    /**
     * 删除一个结点，在头节点后进行删除
     */
    public Node deleteFirst()
    {
        Node temp = first;
        if(first.next == null)
        {
            last = null;
        }
        first = temp.next;
        return temp;
    }


    /**
     * 显示方法
     */
    public void display()
    {
        Node current = first;
        while (current != null)
        {
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 查找方法
     */
    public Node find(long value) {
        Node current = first;
        while(current.data != value) {
            if(current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 删除方法，根据数据域来进行删除
     */
    public Node delete(long value)
    {
        Node current = first;
        Node previous = first;
        while (current.data !=  value)
        {
            if(current.next == null)
            {
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first)
        {
           first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty()
    {
        return first == null;
    }
    public static void main(String[] args) {
        FirstLastLinkList firstLink = new FirstLastLinkList();
/*        firstLink.insertFirst(35);
        firstLink.insertFirst(20);
        firstLink.insertFirst(10);
        firstLink.display();
        firstLink.deleteFirst();
        firstLink.deleteFirst();
        firstLink.display();*/
        firstLink.insertLast(56);
        firstLink.insertFirst(90);
        firstLink.insertLast(21 );
        firstLink.display();
    }
}

