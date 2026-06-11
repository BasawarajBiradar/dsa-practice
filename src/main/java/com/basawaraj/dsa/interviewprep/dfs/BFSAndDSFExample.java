package com.basawaraj.dsa.interviewprep.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSAndDSFExample {

    public static void main(String[] args) {
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.print("bsf .... ");
        bsf(a);
        System.out.println();
        System.out.print("dsf ..... ");
        dsf(a);
    }

    private static void dsf(Node node) {
        if (node == null)
            return;
        System.out.print(" "+node.value);
        dsf(node.left);
        dsf(node.right);
    }

    private static void bsf(Node root) {
        // goes level by level
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(" "+current.value);

            if (current.left != null)
                queue.offer(current.left);

            if (current.right != null)
                queue.offer(current.right);

        }
    }

}
