public class Main{
    public static void main(String args[]){

        Node<Integer> p = new Node(12);
        Node<Integer> q = new Node(5);
        p.setNext(q);
        q.setNext(p);
        System.out.print(1%2);


        // queue.print();
    }
}