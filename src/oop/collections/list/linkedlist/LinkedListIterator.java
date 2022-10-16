package oop.collections.list.linkedlist;

public class LinkedListIterator {
    private Node node;

    public LinkedListIterator(Node head) {
        this.node=head;
    }
    public boolean hasNext(){
        return node != null;
    }
    public String next(){
        String data = node.getData();
        node=node.getNext();
        return data;
    }
}
