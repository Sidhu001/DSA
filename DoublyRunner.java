package linkedList;

public class DoublyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		//Inserting at beginning (Stack like way)
//		doublyLinkedList.insert(1);
//		doublyLinkedList.insert(2);
//		doublyLinkedList.insert(3);
		
		//Inserting at ending (Queue like way)
		doublyLinkedList.insertAtEnd(1);
		doublyLinkedList.insertAtEnd(3);
		doublyLinkedList.insertAtEnd(4);
//		doublyLinkedList.printlist(doublyLinkedList.head);
		
		//Inserting after a certain node
		doublyLinkedList.insertAfter(doublyLinkedList.head, 2);
//		doublyLinkedList.printlist(doublyLinkedList.head);
//		
		//Inserting before a certain node
		doublyLinkedList.insertBefore(doublyLinkedList.head, 0);
		doublyLinkedList.printlist(doublyLinkedList.head);

	}

}
