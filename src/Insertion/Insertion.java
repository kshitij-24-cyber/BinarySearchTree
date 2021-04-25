package Insertion;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {
    public BstNode root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private BstNode insert(BstNode root, int data) {
        if (root == null) {
            root = new BstNode(data);
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(insert(root.getLeft(), data));
        } else {
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public void inorder() {
        inorder(this.root);
    }

    private void inorder(BstNode root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }

    public void bfs() {
        if (root != null) {
            Queue<BstNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                BstNode temp = q.remove();
                if (temp != null) {
                    System.out.print(temp.getData() + " ");
                    if (temp.getLeft() != null) {
                        q.add(temp.getLeft());
                    }
                    if (temp.getRight() != null) {
                        q.add(temp.getRight());
                    }
                } else if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }
            }
            System.out.println();
        }
    }
}
