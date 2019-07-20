package com.test.tree;

/**
 * @author 宁超
 * @date 2019/5/7 - 16:13
 */
public class TestTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10,"James");
        tree.insert(20,"YAO");
        tree.insert(15,"Kobi");
        tree.insert(3,"Max");
        System.out.println(tree.root.data);
    }
}
