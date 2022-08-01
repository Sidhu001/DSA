package linkedList;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SinglyLinkedList list = new SinglyLinkedList();
//		list.insert(18);
//		list.insert(45);
//		list.insert(12);
//		list.insertAtStart(10);
//		list.insertAt(2, 44);
//		list.display();
//		list.deleteAt(2);
//		list.display();
//		int length = list.length();
//		Node node = list.searching(18);
//		System.out.println(node.data);
//		System.out.println(length);
//		list.deleteAll();
//		list.display();

		CircularLinkedList cList = new CircularLinkedList();
		cList.insert(7);
		cList.insert(8);
		cList.insertAtStart(5);
		cList.insertAtStart(4);
		cList.insertAt(2, 6);
		cList.insertAt(0, 2);
		cList.insertAt(1, 3);
		cList.display();
		Node found = cList.searching(2);
		System.out.println(found.data);
		cList.deleteAt(6);
		cList.display();
		System.out.println(cList.length());
		cList.deleteAll();
		cList.display();
	}

}
