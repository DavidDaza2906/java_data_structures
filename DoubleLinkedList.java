public class DoubleLinkedList<T> {
    public DoubleNode<T> head;
    public DoubleNode<T> tail;
    private int size;
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void checkIndex(int index){
        if (this.size <= index || index<0) throw new IndexOutOfBoundsException();
    }
    public void remove(int index){
        this.checkIndex(index);
        DoubleNode<T> temp;
        temp = this.head;
        if (index == this.size-1){
            temp = this.tail;
            this.tail = this.tail.getPrev();
            tail.setNext(null);
        }
        else if (index ==0){
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }
        else{
            int count = 0;
            while (count != index){
                temp = temp.getNext();
                count++;
            }
            DoubleNode<T> next = temp.getNext();
            DoubleNode<T> prev = temp.getPrev();
            prev.setNext(next);
            next.setPrev(prev);
        }
        
        this.size--;
    }
    public void add(T t, int index){
        DoubleNode<T> newNode = new DoubleNode<T>(t);
        DoubleNode<T> temp;
        if (index == 0){
            newNode.setNext(this.head);
            newNode.setPrev(null);
        if(head!=null)
            this.head.setPrev(newNode);
        this.head = newNode;
        if(tail==null)
            tail=newNode;
        }
        else if(index == size){
            newNode.setNext(null);
            newNode.setPrev(this.tail);
            if(this.tail!=null)
                this.tail.setNext(newNode);
            this.tail = newNode;
            if(this.head==null)
                this.head=newNode;
        }
        else{
            this.checkIndex(index);
            int count = 0;
            temp = this.head;
            while (count != index-1){
                temp = temp.getNext();
                count++;
            }
            newNode.setNext(temp);
            newNode.setPrev(temp.getPrev());
            temp.getPrev().setNext(newNode);
            temp.setPrev(newNode);
        }
        this.size++;
    }
    public T get(int index){
        this.checkIndex(index);
        if(index ==0) {
            return this.head.getKey();}
        else if (index == this.size-1){ 
            return this.tail.getKey();}
        else{}
            DoubleNode<T> temp;
            temp = this.head;
            int count = 0;
            while (count != index){
                temp = temp.getNext();
                count++;
            }
            return temp.getKey();
        }
        
    public int size(){
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int getIndex(T t) {
        DoubleNode<T> temp = this.head;
        int i = 0;
        while (temp != null) {
            if(temp.getKey().equals(t)){
                return i;
            }
            i++;
            temp = temp.getNext();
        }
        return -1;
    }
    public void print(){
        DoubleNode<T> temp = this.head;
        while(temp!= null){
            System.out.print(temp.getKey()+ " ");
            temp = temp.getNext();
            
        }
    }
}
