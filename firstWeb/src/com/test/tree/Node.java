package com.test.tree;

/**
 * 二叉树的节点
 * @author 宁超
 * @date 2019/5/7 - 15:35
 */
public class Node {

    //数据项
    public long data;
    //数据项
    public String sdata;
    //左子节点
    public Node leftChild;
    //右子节点
    public Node rightChild;

    public Node(long value,String sData)
    {
        this.data = value;
        this.sdata = sData;
    }
}
