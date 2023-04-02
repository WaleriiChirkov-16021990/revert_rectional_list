public class bidirectional_list {
	private Node head;
	private Node tail;
	
	public void revert(){
		Node currentNode = head;
		while (currentNode != null) {
			Node next = currentNode.next;
			Node previous = currentNode.previous;
			currentNode.next = previous;
			currentNode.previous = next;
			if (previous == null) {
				tail = currentNode;
			}
			if (next == null) {
				head = currentNode;
			}
			currentNode = next;
		}
	}
	
	
	
	private class Node {
		private Node next;
		private Node previous;
		private int value;
	
	}
}
