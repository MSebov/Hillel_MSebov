package com.hillel.homework7;

public class ArrList<String> {
    private final int initSize = 16;
    private final int cut = 4;
    private Object[] array = new Object[initSize];
    private int pointer = 0;


    public void add(String item) {
        if (pointer == array.length - 1)
            resize(array.length * 2);
        array[pointer++] = item;
    }


    public String get(int index) {

        return (String) array[index];
    }


    public void delete(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > initSize && pointer < array.length / cut)
            resize(array.length / 2);
    }

    public int size() {

        return pointer;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}