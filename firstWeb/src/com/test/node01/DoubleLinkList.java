package com.test.node01;


/**
 * 双向链表
 * @author 宁超
 * @date 2019/5/6 - 19:45
 */
public class DoubleLinkList {
    //头结点
    private Node first;
    //尾结点
    private Node last;
    public DoubleLinkList()
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
        }else{
            first.previous = node;
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
            node.previous = last;
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
        }else {
            first.next.previous = null;
        }
        first = temp.next;
        return temp;
    }
    /**
     * 删除结点，从尾部进行删除
     */
    public Node deleteLast()
    {
        Node tmp = last;
        if(first.next == null)
        {
            first = null;
        }else{
            last.previous.next = null;
            last = last.previous;
        }
        return last;
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
            current.previous.next = current.next;
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
        DoubleLinkList dl = new DoubleLinkList();
        dl.insertLast(45);
        dl.insertLast(56);
        dl.insertLast(90);
        dl.display();
        dl.deleteLast();
        dl.display();
        while (!dl.isEmpty())
        {
            dl.deleteFirst();
            dl.display();
        }
    }
}

