package linkedList;

public class CircularLinkedList {
	
	private Node head = null;
	private Node tail = null; 
	
	//This function will add the new node at the end of the list. 
	public void insert(int data) {
		//Create new Node
		Node node = new Node(data);
		node.next = null; // By default it will be null declaration just for clarification
		//check if the list is empty
		if(head==null) {
			//if list is empty both head and tail will point to a new node and new node will point to head
			head=node;
			tail=node;
			node.next=head;	
		}else {
			//tail will point to a new Node
			tail.next=node;
			
			//New node will become tail
			tail = node;
			
			//Since it is circular linked list it will point to head
			tail.next=head;
		}
	}
	
	// Inserts elements at beginning of the list
	public void insertAtStart(int data) {
		
		// Create the new node to be added
		Node node = new Node(data);
		node.next = null;
		
		// Create a temporary node to traverse to the last node 
		Node current = head;
		while(current.next!=head) {
			current = current.next;
		}
		
		//After reaching to the last node point it to new node to be added 
		current.next = node;
		
		//Assign the current head node to next of new node to be added
		node.next = head;
		
		//Assign the new node as head node
		head = node;
		
	}
	
	// Inserts element at specified index
	public void insertAt(int index, int data) {
		
		// Create the new node to be added
		Node node = new Node(data);
		node.next = null;   // By default it will be null declaration just for clarification
		
		if(index == 0) {
			insertAtStart(data);
		}else{
			// Set current = head to start traversing from beginning to desired position
			Node current = head;
			// Traversing to desired position
			for(int i=0;i<index-1;i++) {
				current = current.next;
			}
			
			// Create a temporary node to assign the next value to the new Node to be added
			Node temp = current.next;
			
			// Assigning the new Node after reaching desired position
			current.next = node;
			
			// Pointing the new node to the temporary node created
			node.next = temp;
		}
	}
	
	//To return the desired Node
	public Node searching(int data) {
		// Set current = head to start traversing from beginning to desired position
		Node current = head;
		
		// Logic to find the node
		while(current.next!=head && current.data!=data) {
			current = current.next;
		}
		return current;
	}
	
	//deleteAt(index)
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			Node current = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				current = current.next;
			}
			n1 = current.next;
			current.next = n1.next;
			n1 = null;
		}
	}
	
	//delete() delete the node at end
	public void deleteAll() {
		if(head == null) {
			System.out.println("List doesn't exist");
		}else {
			head = null;
			tail.next = null;
			tail = null;
		}
	}
	
	//Display all the nodes
	public void display() {  
        Node current = head;  
        
        //Check if the list is empty or not
        if(head == null && tail == null) {  
            System.out.println("List is empty");  
        }  
        else {  
        	while(current.next!=head) {
    		System.out.print(current.data + " -> ");
    		current = current.next;
        	}
        	System.out.print(current.data);
        }
    	System.out.println();
    }  
	
	public int length() {
		Node node = head;
		int length = 0;
		while(node.next!=head) {
			length++;
			node = node.next;
		}
		return length;
	}
	
	
}
