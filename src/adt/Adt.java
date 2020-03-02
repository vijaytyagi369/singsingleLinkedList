package adt;

public interface Adt<E> {
    public void add(E Item);
    public E remove(E Item);
    public void sort();
    public E search(E Item);

}
