public class unidirectional_list {
	Node head;
	
	public void revert() {
		if (head != null && head.next != null) {
			revert(head.next, head);
		}
	}
	
	private void revert(Node currentNode, Node previosNode) {
		if (currentNode.next == null) {
			head = currentNode;
		} else {
			revert(currentNode.next, currentNode);
		}
		currentNode.next = previosNode;
		previosNode.next = null;
	}
	
	
	private class Node {
		private int value;
		private Node next;
	}
}
