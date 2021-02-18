package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(19);
        list.add(92);
        list.add(-7);
        System.out.println(list.toString());
        list.multiply(0);
        System.out.println(list.toString());
    }
}
