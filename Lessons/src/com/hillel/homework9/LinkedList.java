package com.hillel.homework9;

public class LinkedList implements iCustomCollection {

    Node last;
    Node first;
    int size;

    @Override
    public boolean add(String str) {
        Node temp = last;
        Node newNode = new Node(temp, str, null);
        last = newNode;
        if (temp == null) {
            first = newNode;
        } else {
            temp.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public String get(int index) {
        if (index >= size || index < 0) {
            return "Null pointer exception";
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }


    @Override
    public boolean delete(int index) {
        if (index >= size || index < 0) {
            System.out.println("Null pointer exception");
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node next = temp.next;
        Node prev = temp.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            temp.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            temp.next = null;
        }
        temp.value = null;
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        if (str == null) {
            Node temp = first;

            for (int i = 0; i < size; i++) {
                if (temp.value == null) {
                    delete(i);
                    return true;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("No matches");
            }
        } else {
            Node temp = first;
            for (int i = 0; i < size; i++) {

                if (temp.value == str) {
                    delete(i);
                    return true;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("No matches");
            }
        }
        return false;
    }


    @Override
    public boolean addAll(String[] strArr) {
        if (strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            add(str);
        }
        return true;
    }


    @Override
    public boolean addAll(LinkedList strColl) {
        String[] strArr = listToArray(strColl);
        addAll(strArr);
        return false;
    }


    @Override
    public boolean clear() {
        for (Node temp = first; temp != null; temp = temp.next) {
            Node next = temp.next;
            temp.value = null;
            temp.next = null;
            temp.prev = null;
        }
        first = null;
        last = null;
        size = 0;
        return true;
    }


    @Override
    public boolean contains(String str) {
        Node temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.value == str) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean trim() {
        Node temp = first;
        for (int i = 0; i < size; i++) {
            temp.value = temp.value.trim();
            temp = temp.next;
        }
        return true;
    }

    @Override
    public boolean compare(LinkedList coll) {
        if (size < coll.size || size > coll.size) {
            return false;
        } else {
            Node firstList = first;
            Node secondList = coll.first;
            for (int i = 0; i < size; i++) {
                if (firstList.value != secondList.value) {
                    return false;
                }
                firstList = firstList.next;
                secondList = secondList.next;
            }
        }
        return true;
    }

    public void printList() {
        Node temp = first;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (temp != last) {
                System.out.print(temp.value + ", ");
                temp = temp.next;
            } else {
                System.out.print(temp.value);
            }
        }
        System.out.print("]\n");
    }

    public int getSize() {
        return size;
    }

    private String[] listToArray(LinkedList strColl) {
        Node temp = strColl.first;
        String[] strArr = new String[strColl.size];
        for (int i = 0; i < strColl.size; i++) {
            strArr[i] = temp.value;
            temp = temp.next;
        }
        return strArr;
    }

    private static class Node {
        String value;
        Node next;
        Node prev;

        public Node(Node prev, String value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}