package com.sumit;

public class Main {

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        //The Binary Tree Looks like this:
        //           1
        //       2        3
        //    5    4    7   6
        //       9   8
        one.setLeft(two);
        one.setRight(three);
        two.setRight(four);
        two.setLeft(five);
        three.setRight(six);
        three.setLeft(seven);
        four.setRight(eight);
        four.setLeft(nine);
        System.out.println("Preorder traversal: ");
        preOrder(one);
        System.out.println(" ");
        System.out.println("Inorder traversal: ");
        inOrder(one);
        System.out.println(" ");
        System.out.println("Postorder traversal: ");
        postOrder(one);
    }

    public static void preOrder(Node root)
    {
        if(root == null)
            return;
        System.out.print(" "+root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public static void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.getLeft());
        System.out.print(" "+ root.getValue());
        inOrder(root.getRight());
    }
    public static void postOrder(Node root)
    {
        if(root == null)
            return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(" "+root.getValue());
    }


}

class Node {
    private Node right;
    private Node left;
    private int value;

    public Node (int value)
    {
        this.value = value;
    }

    public Node getLeft()
    {
        return left;
    }
    public void setLeft(Node left)
    {
        this.left = left;
    }
    public void setRight(Node right)
    {
        this.right = right;
    }

    public Node getRight()
    {
        return right;
    }
    public int getValue()
    {
        return value;
    }

}