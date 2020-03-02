package defination;
import adt.Adt  ;

public class singleLinkedList<E>implements Adt<E> {
    private Node<E>head=null;
    public int size=0;

    public Node<E>getNode(int index){

        Node<E> response=head;
        for (int i = 0; i <index && response!=null ; i++) {
            response=response.getNext();
        }
        return response;
    }


    public void addFirst(E item){
    head=new Node(item,head);
    size++;
    }

    public void addAfter(E Item, Node<E> afterNode){
        Node<E> temp=afterNode.getNext();
        if(temp==null){
            afterNode.next=new Node<>(Item,null);
        }
        else{
            afterNode.next=new Node<>(Item,afterNode.next);
        }
    }

    public void add(int index,E Item){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            addFirst(Item);
        }
        else{
            addAfter(Item,getNode(index-1));
        }
    }

    @Override
    public void add(E Item) {
        add(size,Item);

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
