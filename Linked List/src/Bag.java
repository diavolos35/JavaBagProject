 
public class Bag<E> {
	private Node<E> head;
	public Bag() {
		head=null;
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else
			return false;
	}
	public void add(E key) {
		if(isEmpty()) {
			Node<E> nNode = new Node<E>(key);
			head=nNode;
		}
		else {
			Node<E> current=head;
			Node<E>last=head;
			boolean found= false;
			while(current!=null) {
				if(current.getKey().equals(key)) {
					current.incrementData();
					found=true;
					break;
				}
				last =current;
				current=current.getNext();
			}
			if(!found) {
				Node<E> nNode = new Node<E>(key);
				last.setNext(nNode);
			}
		}
	}
	public boolean contains(E key) {
		Node<E> current = head;
		while(current!=null) {
			if(current.getKey().equals(key)) {
				return true ;
			}
			current=current.getNext();
		}
		return false;
	}
	public boolean remove(E key) {
		if(!contains(key)) {
			System.out.println("The data " + key + " cannot be found here");
		}
		else {
			Node<E> current = head;
			Node<E> previous= head;
			while(current!=null) {
				if(current.getKey().equals(key)) {
					if(current==head) {
						current.decreaseData();
						if(current.getData()<1) {
							head=head.getNext();
							return false;
						}
						return true;
					}
					else {
						current.decreaseData();
						if(current.getData()<1) {
							previous.setNext(current.getNext());
							current.setNext(null);
							return false;
						}
						return true;
					}
				}
				previous=current;
				current=current.getNext();
			}
		}
		return false;
	}
	public int size() {
		Node<E> current= head;
		int size=0;
		while(current !=null) {
			size=size + current.getData();
			current=current.getNext();
			
		}
		return size;
	}
	public int distictSize() {
		Node<E> current = head;
		int counter =0;
		while(current!=null) {
			counter ++;
			current=current.getNext();
		}
		return counter;
	}
	public int elementSize(E key) {
		Node<E> current = head;
		int elementsize=0;
		while(current!=null) {
			if(current.getKey()==key) {
				elementsize=current.getData();
				break;
			}
			current=current.getNext();
		}
		return elementsize;
	}
	public void clear() {
		head=null;
	}
	public String toString() {
		if(isEmpty()) {
			return "Bag is empty";
		}
		Node<E> current = head;
		String string = "Bag = ";
	    while(current != null) {
	    	for(int i =0;i<current.getData();i++) {
	    		string +="["+current.getKey()+ "]";
	    	}
	    	current=current.getNext();
	    }
	    return string;
	}
	public boolean equals(Bag<E> b) {
		   
		   return equals(head, b.head);
		 
		  
	   }
	private boolean equals(Node<E> a, Node<E> b) { // i took help in here from my class mate 
		   if(a==null || b==null) {
			   return a==b;
		   }
		   if(!a.getKey().equals(b.getKey()))
			   return false;
		   if(a.getData()!=b.getData())
			   return false;
		   return equals(a.getNext(),b.getNext()) ;
	   }
	
		
		  
}


