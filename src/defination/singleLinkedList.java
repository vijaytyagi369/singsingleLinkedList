package defination;
import adt.Adt  ;

public class singleLinkedList<E>implements Adt<E> {

    
    @Override
    public void add(E Item) {

    }

    @Override
    public E remove(E Item) {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public E search(E Item) {
        return null;
    }

    private static class Node<E>{
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(E data){
            this.data=data;
        }

        public E getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}