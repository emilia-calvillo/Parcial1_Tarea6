public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data){
        Node node=new Node(data);
        size++;
        if (head == null){
             head = node;
        }else{
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
    }

    public void addAtFront(String data){
        Node node=new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
        }else{
            node.setNext(head);
            head.setPrevious(node);
            head=node;
        }
    }

    public boolean removeIndex(int indexToRemove){
        if (indexToRemove <0 || indexToRemove >= size){
            return false;
        }
        if(size == 1){
            head=null;
            tail=null;
        }else if(indexToRemove == 0){
            head = head.getNext();
            head.setPrevious(null);
        }else if (indexToRemove == size){
            tail= tail.getPrevious();
            tail.setNext(null);
        }else{
            Node iteratorNode = findNodeByIndex(indexToRemove);

            iteratorNode.getPrevious().setNext(iteratorNode.getNext());
            iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());
        }
        size--;
        return true;
    }

    public void removeAll(){
        while (head != tail){
            head = head.getNext();
            head.setPrevious(null);
        }
        head=null;
        size=0;
    }

    public boolean setAt(int indexToSearch,String data){
        if (indexToSearch <0 || indexToSearch >= size){
            return false;
        }
        Node iteratorNode = findNodeByIndex(indexToSearch);
        iteratorNode.setData(data);
        return true;
    }

    public String getAt(int indexToSearch){
        if (indexToSearch <0 || indexToSearch >= size){
        return null;
        }
        Node iteratorNode = findNodeByIndex(indexToSearch);
        return iteratorNode.getData();
    }

    public boolean AllWithValue(String data){
        Node iteratorNode= head;
        while (iteratorNode != null){
            if(iteratorNode.getData().equals(data)){
                size--;
                if(iteratorNode==head){
                    head = head.getNext();
                    head.setPrevious(null);
                } else if (iteratorNode==tail){
                    tail= tail.getPrevious();
                    tail.setNext(null);
                }else{
                    iteratorNode.getPrevious().setNext(iteratorNode.getNext());
                    iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());
                }
            }
            iteratorNode=iteratorNode.getNext();
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public LinkedListIterator getIterator() {
        return new LinkedListIterator(head);
    }

    private Node findNodeByIndex(int indexToRemove) {
        Node iteratorNode = head;
        int indexIteratorNode = 0;

        while (indexIteratorNode < indexToRemove){
            iteratorNode = iteratorNode.getNext();
            indexToRemove++;
        }
        return iteratorNode;
    }
}
