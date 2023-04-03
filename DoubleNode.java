public class DoubleNode<T> {
    private T key;
    public DoubleNode<T> next;
    private DoubleNode<T> prev;
    public DoubleNode(T key){
        this.key = key;
        next = null;
        prev = null;
    }
    public T getKey(){
        return this.key;
    }
    public void setKey(T key){
        this.key =key;
    }
    public DoubleNode<T> getNext(){
        return this.next;
    }
    public void setNext(DoubleNode<T> next){
        this.next = next;
    }
    public DoubleNode<T> getPrev(){
        return this.prev;
    }
    public void setPrev(DoubleNode<T> prev){
        this.prev = prev;
    }
}
