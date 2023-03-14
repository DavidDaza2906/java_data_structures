import java.util.LinkedList;
public class ArrayQueue<T> {
    LinkedList<T> queue;
    int size;
    ArrayQueue(){
        this.queue = new LinkedList<>();
        this.size =0;
    }
    public void add(T t){
        this.size++;
        queue.add(size-1,t);
    }
    public T peek(){
        if (this.size <0){
            return null;
        }
        return (T)this.queue.get(0);
    }
    public T poll(){
        if (this.size <0){
            return null;
        }
        size--;
        return (T)this.queue.remove(0);
    }
    public boolean empty(){
        return (this.size <0);
    }
    public int search(T t){
        return this.queue.indexOf(t);
    }
    public void print(){
        int i =0;
        while(i <this.size){
            System.out.print(this.queue.get(i)+ " ");
            i++;
        }
    }
}