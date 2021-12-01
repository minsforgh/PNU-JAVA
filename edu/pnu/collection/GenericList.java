package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;
    private int limit;

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
    }
    public GenericList(int limit) {
        this.limit = limit;
        data = new Object[limit];
    }

    public void add(T obj) {
        data[size] = obj;
        size++;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        data = new Object[limit];
        size = 0;
    }
}