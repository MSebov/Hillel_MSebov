package com.hillel.homework9;

public interface iCustomCollection {

    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(LinkedList strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(LinkedList coll);

}

