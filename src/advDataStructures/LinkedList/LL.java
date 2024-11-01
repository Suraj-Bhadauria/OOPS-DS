package advDataStructures.LinkedList;

/*
Notes
-> You do not change position of head until you change the structure of linked list, changing structure means
    adding, removing elements
-> for printing the element type operations, you don't mess with head
-> thus you use temp and keep it moving forward .
-> temp = head
-> temp is not a part of the structure of the linked list
 */

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail=head;
        }
        size++;

    }



    // this method of putting element at last position takes O(1) tc
    // the other method can be finding where the element null is and putting there
    // but it will take O(n) tc
    // this is the benefit of taking/maintaining tail pointer
    public void insertLast(int val){

        if(tail==null){           //if the list is empty
            insertFirst(val);      // call insertfirst
            return;                // exit , (everything done by insertfirst func)
        }

        //imagine this as creating a new box with a value
        Node node = new Node(val);   //this newly made box is not connected with anything
        tail.next = node;              // we connect this to the tail
        tail = node;                    // we make tail pointer to point to this node
        size++;                        // increasing the size by 1
    }

    //if we want to insert it anywhere
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){         // starting from one bcoz this temp node itself is 0
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        // first create a new node
        // while creating, we calling constructor (val, nextnode) for next node, we can see that next node is the node next to the current node
        // thus,temp.next (refer ipad notes)
        temp.next = node;
        size++;

    }

    // getting the value(reference) at an index
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }

    // it will return the pointer to a node
    // tc O(n)
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){return node;}
            node=node.next;
        }
        return null;  //if nothing is found
    }



    //DELETION

    //delete first
    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head==null){ tail=null;}
        size--;

        return val;
    }

    //delete last
    // for this you want to make tail point to the second last node but we lack any previous func like we have next func
    // for this we iterate and come to second last element and make tail pointing to it and secondelement.next to null
    // for this we are creating a function to take the index of that second last element and returning the reference to it.



    //deleting last element
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    //deleting from any index
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;



        return val;
    }


    public void diplay(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp= temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

}
