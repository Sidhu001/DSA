package linkedList;

public class SinglyLinkedList {
	
	Node head;
	Node tail;
	int size;
	
	//insert(data)
	public void insert(int data) {
		//Create the new Node to be added
		Node node = new Node(data);
		node.next = null;
		
		//Check if the list is empty or it already has a head
		if(head==null) {
			head=node;
		}else {
			//To traverse till current last node make a temporary node point it to head then traverse till last node(i.e node.next!=null)
			//When node.next == null that means we have reached the last node
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
			
		}
	}
	
	//insertAtStart(data)
		public void insertAtStart(int data) {
			//Create the new Node to be added
			Node node = new Node(data);
			node.next = null;
			// The new node next should point to the existing head as its next (Because new node will be head when it is assigned at starting)
			node.next = head; 
			
			//Assigning new node as head
			head = node;
		}
	
	//insterAt(index,data)
	public void insertAt(int index, int data) {
		//Create the new Node to be added
		Node node = new Node(data);
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}
		
		Node n = head;
		for(int i=0;i<index-1;i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;

	}
	
	//To return the desired Node
	public Node searching(int data) {
		// Set current = head to start traversing from beginning to desired position
		Node current = head;
		
		// Logic to find the node
		while(current.next!=null && current.data!=data) {
			current = current.next;
		}
		return current;
	}

	//deleteAt(index)
	public void deleteAt(int index) {
		if(index==0) {
			head = head.next;
		}else {
			Node current = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++){
				current=current.next;
			}
			n1 = current.next;
			current.next = n1.next;
			n1=null;
		}
	}
	
	//delete() delete the node at end
	public void deleteAll() {
		head = null;
		tail = null;
	}
	
	//show() //To display all elements
	public void display(){
		Node node = head;
		if(node==null) {
			System.out.println("List is empty");
		}else {
		while(node.next!=null) {
			System.out.print(node.data+" -> ");
			node = node.next;
		}
		System.out.println(node.data);
		}
	}
	
	public int length() {
		Node node = head;
		int length = 0;
		while(node!=null) {
			length++;
			node = node.next;
		}
		return length;
	}
	
}
