
public class Node<E>
{
    public E data;
    public int count;
    public Node<E> left;
    public Node<E> right;

    public Node(E d)
    {
        this.data=d;
        this.count=1;
        this.right=null;
        this.left=null;
    }

    public E getData()

    {
        return data;
    }

    public Node<E> getRight() {
        return right;
    }

    public int getCount() {
        return count;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public void incrementCount()
    {
        count++;
    }

    public void decreaseCount()
    {
        count--;
    }
    public boolean hasLeft()
    {
        return (left != null);
    }

    public boolean hasRight()
    {
        return (right != null);
    }
  
}