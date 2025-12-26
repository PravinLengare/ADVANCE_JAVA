package com.pravin.Generics;

public class StringContainer<T> implements GenericInterface<T>{

    private T item;
    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
