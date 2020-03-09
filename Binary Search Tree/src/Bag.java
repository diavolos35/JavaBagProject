
public class Bag<E extends Comparable<E>> {

    Node<E> root;

    public Bag() {

        root=null;
    }      
    
    public Bag(Node<E> newNode)
    {
        root=newNode;
    }
    public boolean isEmpty()
    {
        if (root == null)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public  void add(E data)
    {

        if (isEmpty()) {
            Node<E> newNode = new Node<E>(data);
            root = newNode;

        }

        else{
            Node<E> current=root;
            while (true)
            {
                if (data.compareTo(current.getData()) <0 )
                {
                    if (current.getLeft()!=null)
                    {
                        current=current.getLeft();
                    }
                    else
                    {
                        Node<E> newNode=new Node<E>(data);
                        current.setLeft(newNode);
                        break;
                    }
                }
                    else if(data.compareTo(current.getData()) >0)
                {
                    if (current.getRight()!=null)
                    {
                        current=current.getRight();
                    }
                    else
                    {
                        Node<E> newNode=new Node<E>(data);
                        current.setRight(newNode);
                        break;
                    }
                }
                else if(data.compareTo(current.getData()) ==0)
                {

                    current.incrementCount();
                    break;
                }
            }
        }
    }
    public boolean contains(E data)
    {
        Node<E> current=root;
        boolean found=true;
        while (found) {
            if (data.compareTo(current.getData()) < 0) {
                if (current.getLeft() != null) {
                    current = current.getLeft();
                }
                else break;


            }  if (data.compareTo(current.getData()) > 0) {
                if (current.getRight() != null) {
                    current = current.getRight();
                }
                else break;

            }  if (data.compareTo(current.getData()) == 0) {

               found=false;
            }
        }
        return !found;
    }
    private Node<E> findMinFromRight(Node<E> node) {
        while(node.getLeft() !=null)
        {
            node=node.getLeft();
        }
        return node;
    }

    public boolean remove(E data) {
        if (!contains(data)) {
            System.out.println("The item '" + data + "' is not located in the Bag");
            return false;
        }
        else {
            Node<E> temp = remove(root, data);
            if (contains(temp.getData())) {
                return true;
            } else
                return false;
        }
    }
    private Node<E> remove(Node<E> root,E data) {


        Node<E> current = root;
        if (current == null) {
            return current;
        }
        if (data.compareTo(current.getData()) < 0) {
             current.setLeft(remove(current.getLeft(), data));
        }
        else if (data.compareTo(current.getData()) > 0) {
            current.setRight( remove(current.getRight(), data));
        }
        else {
            if (current.getCount() > 1) {
                current.decreaseCount();
                return current;
            }
            else {
                if (current.getLeft() != null && current.getRight() != null ) {
                    Node<E> MinFromRightSubTree=findMinFromRight(current.getRight());
                    current.setData(MinFromRightSubTree.getData());
                    remove(current.getRight(),MinFromRightSubTree.getData());
                }
                else if (current.getLeft() != null ) {
                    current=current.getLeft();
                }
                  else if (current.getRight() != null ) {
                       current=current.getRight();
                 }
                 else
                {
                    current=null;
                }
            }
        }
        return current;
    }

    public void clear()
    {
        root=null;
    }

    public int distictSize() {
        return (distictSize(root));
    }

    private int distictSize(Node<E> node)
    {
        if (node==null) {
            return(0);
        }
        else {
        return (distictSize(node.getLeft()) + 1 + distictSize(node.getRight()));
        }
    }

    public int elementSize(E data) {
        Node<E> current = root;

        int elementsize = 0;
        if (!contains(data)) {
            System.out.print(data+" is not found in the Bag, "+data+":");
             return 0;
        }
           else {
            while (true) {
                if (data.compareTo(current.getData()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    }
                } else if (data.compareTo(current.getData()) > 0) {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    }
                } else if (data.compareTo(current.getData()) == 0) {
                     elementsize = current.getCount();
                    break;
                }
            }
            return elementsize;
        }
    }

    public int size()
    {
        return size(root);
    }

    private int size(Node<E> node) {
        int size=0;
        if (node==null) {
            return(0);
        }
        else {
        return node.getCount()+ size(node.getLeft()) + size(node.getRight());
        }
    }


    public String toString()
    {
       return toString(root);
    }

    private String toString(Node<E> root) {
        if(isEmpty())
        {
            return "Bag is empty";
        }
       else {
            Node<E> current = root;
            String result = "";
            if (current == null) {
                return "";
            }
            result += toString(current.getLeft());
            result += "[" + current.getData().toString() + " : " + current.getCount() + "]";
            result += toString(current.getRight());

            return result;

        }
        
    }   
   public boolean equals(Bag<E> b) {
	   
	   return equals(root, b.root);
	 
	  
   }
   private boolean equals(Node<E> a, Node<E> b) { // i helped here from my class mate 
	   if(a==null || b==null) {
		   return a==b;
	   }
	   if(!a.getData().equals(b.getData()))
		   return false;
	   if(a.getCount()!=b.getCount())
		   return false;
	   return equals(a.getLeft(),b.getLeft()) && equals(a.getRight(), b.getRight());
   }
    
  

}

