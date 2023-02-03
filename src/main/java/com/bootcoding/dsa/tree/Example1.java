package com.bootcoding.dsa.tree;


public class Example1 {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;

        System.out.println("Inorder");
        inorder(root);
        System.out.println("\nPreorder");
        preorder(root);
        System.out.println("\nPostOrder");
        postorder(root);

    }

    public static void inorder(TreeNode root) {
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print( "->" + root.data);
        inorder(root.right);

    }
    public static void preorder(TreeNode root) {
        if(root==null){
            return;
        }

        System.out.print("->" + root.data);
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(TreeNode root) {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print("->" + root.data );

    }
}
