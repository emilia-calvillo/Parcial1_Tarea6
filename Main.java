public class Main {
    public  static void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println("Size: "+list.getSize());

        list.addAtTail(String.valueOf(100));
        list.addAtFront(String.valueOf(101));
        list.addAtFront(String.valueOf(102));
        System.out.println("Size: "+list.getSize());

        list.removeIndex(2);
        System.out.println("Size: "+list.getSize());

        System.out.println("Size: "+list.getAt(1));
        list.setAt(1,String.valueOf(200));
        System.out.println("Size: "+list.getSize());
        list.AllWithValue(String.valueOf(200));
        System.out.println("Size: "+list.getSize());


        list.removeAll();
        System.out.println("Size: "+list.getSize());


    }
}
