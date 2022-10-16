import oop.collections.list.arraylist.ArrayList;

public class Main {
    public  static void main(String[] args){
        ArrayList list = new ArrayList();
        System.out.println("Size: "+list.getSize());

        list.addAtTail(String.valueOf(10));
        list.addAtFront(String.valueOf(11));
        list.addAtFront(String.valueOf(12));
        System.out.println("Size: "+list.getSize());

        System.out.println("Value: "+list.getAt(0));
        list.setAt(1,String.valueOf(14));
        System.out.println("Value: "+list.getAt(1));
        System.out.println("Size: "+list.getSize());

        list.removeAll();
        System.out.println("Size: "+list.getSize());
    }
}

/*public class Main {
    public  static void main(String[] args){
        oop.collections.list.linkedlist.LinkedList list = new oop.collections.list.linkedlist.LinkedList();
        System.out.println("Size: "+list.getSize());

        list.addAtTail(String.valueOf(100));
        list.addAtFront(String.valueOf(101));
        list.addAtFront(String.valueOf(102));
        System.out.println("Size: "+list.getSize());

        list.removeIndex(2);
        System.out.println("Size: "+list.getSize());

        System.out.println("Value: "+list.getAt(1));
        list.setAt(1,String.valueOf(200));
        System.out.println("Value: "+list.getAt(1));
        System.out.println("Size: "+list.getSize());
        list.removeAllWithValue(String.valueOf(200));
        System.out.println("Size: "+list.getSize());

        list.removeAll();
        System.out.println("Size: "+list.getSize());
    }
}*/
