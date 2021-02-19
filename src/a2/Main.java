package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(12);
        list.add(12);
        System.out.println(list.toString());
        list.removeRepeats();
        System.out.println(list.toString());
    }
}
