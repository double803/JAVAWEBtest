package com.test.node;

/**
 * @author 宁超
 * @date 2019/5/6 - 19:45
 */
public class LinkList {
    //头结点
    private Node first;

    public LinkList()
    {
        first = null;
    }

    /**
     * 插入一个结点，在头结点之后进行插入
     */
    public void insertFirst(long value)
    {
        Node node = new Node(value);
        node.next = first;
        first = node;
    }

    /**
     * 删除一个结点，在头节点后进行删除
     */
    public Node deleteFirst()
    {
        Node temp = first;
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

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(35);
        linkList.insertFirst(20);
        linkList.insertFirst(10);
        linkList.insertFirst(60);
        linkList.insertFirst(0);
       // linkList.display();
       // linkList.deleteFirst();
        //linkList.display();
        //Node node= linkList.find(20);
        //node.display();

        Node node01 = linkList.delete(60);
        node01.display();
        System.out.println();
        linkList.display();

    }
}

