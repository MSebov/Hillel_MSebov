package com.hillel.homework8;

public interface iArrList {



    boolean add(Object input);// в конец списка

    boolean add(Object input, int index);// по заданному индексу (будет смещать)

    boolean remove(Object del); // удаляет первый элемент который найдет, если их будет 2 одинаковых, то уберает только первый

    boolean remove(int index);// убирает заданную строку по индексу

    Object get(Object String);// возвращать заданную строку, если она есть

    Object get(int Index); // возвращает заданную строку по индексу если он есть

    boolean clear();// удаляет все ссылки всех элементов

    boolean contains(Object String); // есть ли Данная строка в массиве

    int size();


}
