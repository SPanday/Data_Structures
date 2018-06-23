
/**
 * @author Sakshi Panday
 * Jun 21, 2018
 */
import SingleLinkedList.*;

public class SingleLLTest {

	public static void main(String[] args) {
		
		// linked list storing words; list deletion is case sensitive
		LinkedListWrap wordsLinkedList = new LinkedListWrap();
		wordsLinkedList.addNewNode("world");
		System.out.println(wordsLinkedList.toString());
		System.out.println(wordsLinkedList.deleteNodeByValue("world"));
		wordsLinkedList.addNewNode("Hello");
		wordsLinkedList.addNewNode("world");
		wordsLinkedList.addNewNode("!");
		System.out.println(wordsLinkedList.toString());
		System.out.println(wordsLinkedList.deleteNodeByValue("world"));
		System.out.println(wordsLinkedList.toString());
		
		// linked list storing numbers
		LinkedListWrap numberslinkedList = new LinkedListWrap();
		numberslinkedList.addNewNode("1");
		numberslinkedList.addNewNode("2");
		numberslinkedList.addNewNode("3");
		numberslinkedList.addNewNode("4");
		System.out.println(numberslinkedList.toString());
		System.out.println(numberslinkedList.deleteNodeByValue("2"));
		System.out.println(numberslinkedList.toString());
		System.out.println(numberslinkedList.deleteNodeByValue("1"));
		System.out.println(numberslinkedList.toString());
	}

}
