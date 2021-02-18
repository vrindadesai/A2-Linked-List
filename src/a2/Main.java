package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(-29);
        list.add(-33);
        list.add(91);
        list.add(23);
        list.add(26);
        System.out.println(list.toString());
        list.removeAtIndex(1);
        System.out.println(list.toString());
    }
}
