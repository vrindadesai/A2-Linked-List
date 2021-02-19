package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list.toString());
        System.out.println(list.containsCycle());
    }
}
