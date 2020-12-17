package com.hillel.homework8;

public class StringList implements iArrList {

    private int initSize = 10;
    private int cut = 4;
    private int pointer = 0;

    private Object[] array = new Object[initSize];

    public StringList(int initSize) {
        this.initSize = initSize;
        this.array = new Object[initSize];
    }

    public StringList() {

    }

    @Override
    public int size() {
        System.out.println("run size");
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
        }
        System.out.println(count);
        return count;
    }

    @Override
    public boolean add(Object input) {
        System.out.println("run add");
        if (pointer == array.length - 1)
            resize(array.length * 3 / 2 + 1);
        array[pointer++] = input;
        return true;
    }

    @Override
    public boolean add(Object input, int index) {
        System.out.println("run add");
        Object[] newArray = new Object[array.length + 1];
        if (index < 0 || index > array.length)
            System.arraycopy(array, index, newArray, index + 1, pointer - index);


        return true;
    }

    @Override
    public boolean remove(Object del) {
        System.out.println("run remove");
        for (int i = 0; i < pointer; i++)
            if (array[i] == del) {
                System.out.println("removed: " + array[i]);
                array[i] = array[i + 1];
                array[pointer] = null;
                System.out.println("deleted! now there is: " + array[i]);
                pointer--;
                break;
            }
        return true;
    }

    @Override
    public boolean remove(int index) {
        System.out.println("run remove index");
        for (int i = 0; i < pointer; i++)
            if (array[i] == array[index]) {
                System.out.println("removed: " + array[i]);
                array[i] = array[i + 1];
                array[pointer] = null;
                System.out.println("deleted! now there is: " + array[i]);
                pointer--;
                break;
            }
        return true;
    }

    @Override
    public Object get(Object string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == string) {
                System.out.println(array[i]);
            } else {
                System.out.println("No object you looking for");
            }
        }
        return string;
    }

    @Override
    public Object get(int index) {
        if (index < 0 && index < array.length) {
            System.out.println("invalid index");
        }
        return array[index];
    }

    @Override
    public boolean clear() {
        System.out.println("run size");
        array = new Object[initSize];

        return true;
    }


    @Override
    public boolean contains(Object str) {
        System.out.println("run contains");
        for (int i = 0; i < pointer; i++) {
            if (array[i].equals(str)) {
                return true;
            }

        }
        return false;
    }

    private void resize(int newLength) {
        System.out.println("run resize");
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
