package advDataStructures.LinkedList;

public class DLL {

    private Node head;
    int size=0;


    // to insert node in the first position
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.previous =null;
        if(head!=null) {
            head.previous = node;
        }
        head = node;
        size++;
    }

    // to insert node in last position
    // without using tail node (haha)
    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        if(head==null){
            head = node;
            node.previous = null;

            return;
        }
        Node temp = head;               //temp pointer to iterate OR getting it pointed at last position
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = node;
//        node.next = null;   // we have mentioned it above, as it will always be true despite of both the cases
        node.previous = temp;
    }


    // return a reference pointer for a given value(of node)
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
           if(temp.value==value){return temp;}
           temp=temp.next;
        }
        return null;

    }

    // insert after a given node
    public void insertAfter(int after, int value){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exist");
            return;}
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.previous = p;
        if(node.next != null){
            node.next.previous = node;
        }





    }


    public void display(){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.value+"->");
           temp = temp.next;
       }
        System.out.println("END");
    }
                                                    // we can also combine these both display methods in one, according to our wish
    //display in reverse order
    public void displayRev(){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.previous;
        }
        System.out.println("START");
    }






    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node previous, Node next){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }
}
