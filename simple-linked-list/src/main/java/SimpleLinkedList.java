import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    private static class Node<T> {
        T id;
        Node next;
        Node() {}
        Node(T id) {
            this.id = id;
            this.next = null;
        }

        public T getId() {
            return id;
        }
    }

    private int elements;
    private Node headNode,tailNode;

    SimpleLinkedList() {
        this.headNode = null;
        this.elements = 0;
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }
    void push(T value) {
        if(headNode == null) {
            headNode = new Node(value);
            tailNode = headNode;
        }else {
            headNode.next = new Node<>(value);
            headNode = headNode.next;
        }
        elements++;
    }
    T pop() {
//        throw new UnsupportedOperationException("Please implement the SimpleLinkedList.pop() method.");
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        T value = (T) headNode.getId();

        Node temp = tailNode;
        while(temp.next!=null && temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
        headNode = temp;
        --elements;

        return value;
    }

    void reverse() {
        Node current = tailNode;
        Node previous= null;

        while (current!=null) {
            // got the next node of the current node.
            Node next = current.next;
            // break the link between current and next node.
            // and make a link between current and previous node.
            current.next = previous;
            // update previous node pointer to the current node.
            previous = current;
            // update the current node to the next node.
            current = next;
        }

        // now change the head and tail location.
        headNode = tailNode;
        tailNode = previous;
    }

    T[] asArray(Class<T> clazz) {
        if(size()==0)
            return (T[]) Array.newInstance(clazz, 0);

        T[] data = (T[]) Array.newInstance(clazz, size());
        reverse();
        Node current = tailNode;
        for (int index = 0; index < data.length; index++) {
            data[index] = (T) current.getId();
            current = current.next;
        }

        return data;
    }

    int size() {
        return elements;
    }
}
