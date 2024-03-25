package linkedlist;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private ListNode<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode<T> tempNode = head;
            while (tempNode.getLink() != null) {
                tempNode = tempNode.getLink();
            }
            tempNode.setLink(newNode); // setLink 메서드를 사용하여 link 값을 설정
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        ListNode<T> tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getLink();
        }
        return tempNode.getData();
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        if (index == 0) {
            head = head.getLink();
        } else {
            ListNode<T> preNode = head;
            ListNode<T> tempNode = head.getLink();
            for (int i = 0; i < index - 1; i++) {
                preNode = tempNode;
                tempNode = tempNode.getLink();
            }
            preNode.setLink(tempNode.getLink()); // setLink 메서드를 사용하여 link 값을 설정
        }
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private ListNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.getData();
                current = current.getLink();
                return data;
            }
        };
    }
}
