
public class Node<E> {
	private int data ;
	private E key ;
	private Node<E> next;
	
	public Node(E k) {
		data = 1;
		key=k;
		next=null;
	}
	public void setData(int nData) {
		data=nData;
	}
	public void setNext(Node<E> nNext) {
		next = nNext;
	}
	public void setKey(E nKey) {
	    key=nKey;
	}
	public int getData() {
		return data;
	}
	public Node<E> getNext(){
		return next;
	}
	public E getKey() { // i did a mistake here . it was public void getKey() 
		return key;
	}
	public void incrementData() {
		data++;
	}
	public void decreaseData() {
		data--;
	}
	

}
