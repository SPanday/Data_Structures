/**
 * 
 */
package SingleLinkedList;

/**
 * @author Sakshi Panday Jun 21, 2018
 */
public class Node {

	Node next = null;
	String data;

	public Node(String value) {
		setData(value);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
