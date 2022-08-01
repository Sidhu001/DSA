package linkedList;


public class DoublyLinkedList {
	
	Node head;
	
	
	class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	/*
	 *  Insertion 
		A node can be added in four ways 
		1) At the front of the DLL 
		2) After a given node. 
		3) At the end of the DLL 
		4) Before a given node.
	 * 
	 */
	
	//Insert At Beginning
	public void insert(int data) {

	    /* 1. allocate node 
	    * 2. put in the data */
		Node new_node = new Node(data);
		
		 /* 3. Make next of new node as head and previous as NULL */
		new_node.next = head;
		new_node.prev = null;
		
		/* 4. change previous of head node to new node */
		if(head!=null) {
			head.prev = new_node;
		}
		/* 5. move the head to point to the new node */
		head = new_node;
	}
	
	//Insert At Ending
	public void insertAtEnd(int data) {
		
		/* 1. allocate node 
	     * 2. put in the data */
		Node new_node = new Node(data);
		
		Node last = head;
		
		 // 3. This new node is going to be the last node, so make next of it as NULL
		new_node.next = null;
		
		 // 4.If the Linked List is empty, then make the new node as head 
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		 // 5.Else traverse till the last node         
		while(last.next != null) {
			last = last.next;
		}
		 // 6. Change the next of last node 
		last.next = new_node;
		
		// Make last node as previous of new node 
		new_node.prev = last;
	}
	
	// Inserting after a certain node
	public void insertAfter(Node prev_node, int data) {
		
		//1. Check if given previous node is null
		if(prev_node == null) {
			System.out.println("The given previous node cannot be NULL ");
	        return;
		}
		
		 // 2. allocate node 
		 // 3. put in the data 
		Node new_node = new Node(data);
		
		// 4. Make the next of new node as next of previous node
		new_node.next = prev_node.next;
		
		// 5. Make the previous of new node point to prev_node
		new_node.prev = prev_node;
		
		// 6. Make next of prev_node point to new node
		prev_node.next = new_node;
		
		// 7. Change previous of new_node's next node 
		if (new_node.next != null)
            new_node.next.prev = new_node; 
		
		
	}
	
	// Inserting before a certain node
	public void insertBefore(Node next_node, int data) {
		
		//Check if the given nx_node is NULL
        if(next_node == null)
        {
            System.out.println("The given next node can not be NULL");
            return;
        }
          
        
      //Allocate node, put in the data
        Node new_node = new Node(data);
        
        //Making prev of new node as prev of next node
        new_node.prev = next_node.prev;
        
        //Making prev of next node as new node
        next_node.prev = new_node;
        
        //Making next of new node as next node
        new_node.next = next_node;
       
        //Check if new node is added as head
        if(new_node.prev != null)
            new_node.prev.next = new_node;
        else
            head = new_node;
      
	}
	
	//To print the Doubly Linked list
	public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
}
