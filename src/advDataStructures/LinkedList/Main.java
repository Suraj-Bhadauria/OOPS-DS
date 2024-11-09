package advDataStructures.LinkedList;

//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(17);
        list.insertFirst(8);
        list.insertFirst(98);
        list.insertFirst(43);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        list.insertRec(88, 2);
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(2));

        list.display();


        //double linked list
//        DLL list2 = new DLL();
//        list2.insertFirst(3);
//        list2.insertFirst(4);
//        list2.insertFirst(5);
//        list2.insertFirst(6);
//        list2.insertFirst(7);
//        list2.insertLast(45);
//        list2.insertAfter(6,99);
//        list2.display();
//        list2.displayRev();


//        // circular linked list
//        CLL list = new CLL();
//        list.insert(67);
//        list.insert(18);
//        list.insert(82);
//        list.insert(6);
//        list.display();
//        list.delete(82);
//        list.display();
    }



}

