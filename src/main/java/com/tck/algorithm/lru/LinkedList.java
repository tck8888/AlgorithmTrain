package com.tck.algorithm.lru;

/**
 * @author tck88
 * @date 2020/4/6
 */
public class LinkedList<T> {

    Node list;
    int size;

    /**
     * 添加节点
     */
    public void add(T data) {
        Node head = list;
        Node curNode = new Node(data, list);
        list = curNode;
        size++;

    }

    public void add(T data, int index) {
        checkIndex(index);
        Node cur = list;
        Node header = list;
        for (int i = 0; i < index; i++) {
            header = cur;
            cur = cur.next;
        }
        Node node = new Node(data, cur);
        header.next = node;
        size++;

    }

    private void checkIndex(int index) {
        if (!(index >= 0 && index <= size)) {
            throw new IndexOutOfBoundsException("");
        }
    }

    public T removeFirst() {
        if (list != null) {
            Node node = list;
            list = list.next;
            node.next = null;
            size--;
            return node.data;
        }
        return null;
    }

    public T remove(int index) {

        return null;
    }

    public T removeLast() {

        return null;
    }

    public void set(int index, T newData) {

    }

    public T getFirst() {

        return null;
    }

    public T getLast() {

        return null;
    }

    public T get(int index) {

        return null;
    }


    class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
