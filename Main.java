public class Main{
    public static void main(String args[]){
        DoubleLinkedList<Integer> list = new DoubleLinkedList();
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.add(3);
        queue.add(2);
        queue.poll();
        int i= queue.search(2);
       System.out.print(i);
        // queue.print();
    }
}