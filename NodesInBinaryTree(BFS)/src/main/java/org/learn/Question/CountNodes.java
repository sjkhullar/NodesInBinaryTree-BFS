
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
	public static int countNodes(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		int nNodes = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();									
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
			nNodes++;
		}
		System.out.println("Number of nodes in a binary tree : " + nNodes);
		return nNodes;
	}
}
