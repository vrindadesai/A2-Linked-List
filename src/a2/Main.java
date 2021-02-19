package a2;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list.toString());
        LinkedList listOther = new LinkedList();
        listOther.add(2);
        listOther.add(4);
        System.out.println(listOther.toString());
        list.merge(listOther);
        System.out.println(list.toString());

    }
}
