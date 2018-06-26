/**
 * 
 */
package SingleLinkedList;

/**
 * @author Sakshi Panday Jun 21, 2018
 */
public class LinkedListWrap {

	Node head;

	/**
	 * constructor for wrapper class of Single Linked List
	 * 
	 */
	public LinkedListWrap() {
		setHead(null);
	}

	/**
	 * This function is used to add a new node at the end of the single linked list
	 * 
	 * @param value
	 */
	public void addNewNode(String value) {
		if (head == null)
			setHead(new Node(value)); // if it's the first node, we need to set it as the new head
		else {
			Node currentNode = head;
			while (currentNode.next != null)
				currentNode = currentNode.next;
			currentNode.setNext(new Node(value)); // and node is added next to the previous node as single directed list
		}
		System.out.println("New node added: " + value);
	}

	/**
	 * This function is used to delete a node of the single linked list by value
	 * 
	 * @param value
	 * @return
	 */
	public String deleteNodeByValue(String value) {
		if (getHead() == null)
			return "Single Linked List is EMPTY";
		Node currentNode = getHead();
		int foundCount = 0;
		if (currentNode.getData() == value && currentNode.equals(getHead())) {
			foundCount += 1;
			this.setHead(currentNode.getNext()); // if the first node is deleted, we need to set the new head to the
			currentNode = getHead(); // next node
		}
		while (currentNode != null && currentNode.getNext() != null) {
			if (currentNode.getData() == value && currentNode.equals(getHead())) {
				foundCount += 1;
				this.setHead(currentNode.getNext()); // if the first node is deleted, we need to set the new head to the
				currentNode = getHead(); // next node
			} else if (currentNode.getNext().getData() == value) {
				foundCount += 1;
				currentNode.setNext(currentNode.getNext().getNext());// if node is deleted, current node's next node is
																		// still unexplored, so no alteration needed for
																		// while loop
			} else
				currentNode = currentNode.getNext(); // if no changes made, iteration for while loop needed
		}
		if (foundCount == 0)
			return "No node is same as the input value in the single linked list";
		return "Number of Nodes with Value '" + value + "' Deleted: " + foundCount;
	}

	@Override
	public String toString() {
		String llInfo = "";
		if (head == null)
			return "Current Single Linked List: EMPTY";
		else {
			Node currentNode = getHead();
			while (currentNode.next != null) {
				llInfo = llInfo.concat(currentNode.data);
				llInfo = llInfo.concat(" ");
				currentNode = currentNode.next;
			}
			llInfo = llInfo.concat(currentNode.data);
		}
		return "Current Single Linked List:\n" + llInfo + "\n";
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}
