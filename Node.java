public class Node<T> {
    private T key;
    public Node<T> next;
    public Node(T key){
        this.key = key;
        next = null;
    }
    public T getKey(){
        return this.key;
    }
    public void setKey(T key){
        this.key =key;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }

}
