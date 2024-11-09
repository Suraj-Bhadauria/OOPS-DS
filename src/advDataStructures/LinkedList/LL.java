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

import java.util.List;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;

    }


    // this method of putting element at last position takes O(1) tc
    // the other method can be finding where the element null is and putting there
    // but it will take O(n) tc
    // this is the benefit of taking/maintaining tail pointer
    public void insertLast(int val) {

        if (tail == null) {           //if the list is empty
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
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {         // starting from one bcoz this temp node itself is 0
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        // first create a new node
        // while creating, we calling constructor (val, nextnode) for next node, we can see that next node is the node next to the current node
        // thus,temp.next (refer ipad notes)
        temp.next = node;
        size++;

    }

    //insert using recursion
    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node) {
        //base condn
        if (index == 0) {
            Node temp = new Node(value, node);   //passing next node as parametrised constructor
            size++;
            return temp;
        }
        node.next = insertRec(value, index - 1, node.next);  //this is it //not index--
        return node;
    }


    // getting the value(reference) at an index
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // it will return the pointer to a node
    // tc O(n)
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;  //if nothing is found
    }


    //DELETION

    //delete first
    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;

        return val;
    }

    //delete last
    // for this you want to make tail point to the second last node but we lack any previous func like we have next func
    // for this we iterate and come to second last element and make tail pointing to it and secondelement.next to null
    // for this we are creating a function to take the index of that second last element and returning the reference to it.


    //deleting last element
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    //deleting from any index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node previous = get(index - 1);
        int val = previous.next.value;
        previous.next = previous.next.next;


        return val;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }



    //BUBBLE SORT
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value){
//                swap
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second==tail){
                    Node prev = get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next=first;
                }
            }
            bubbleSort(row, col+1);


        }else{
            bubbleSort(row-1, 0);
        }

    }


    // reverse LL using recursion
    private void revRec(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        revRec(node.next);
        tail.next = node;
        tail=node;
        tail.next=null;
    }


    //inplace reversal of LL (using iter)
    public void reverse(){
        if (size<2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;

            }
        }
        head = prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        //skip the firt left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for(int i=0; current!=null&&i<left-1; i++){
            prev = current;
            current= current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse b/w left and right
        ListNode next = current.next;
        for(int i=0; current!=null && i<right-left+1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;

    }



    //Q. If a LL is palindrome or not?
    //creating a local middleNode method here
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //creating a local reverseList method here
    public ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        ListNode nextNode;

        while(current!=null){
            nextNode= current.next;
            current.next= previous;
            previous=current;
            current=nextNode;
        }
        return previous;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;  //storing this head in temp variable

        //compare both the halves
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                break;    //not returned from here bcoz we also need to re reverse the list
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(reReverseHead)  ;   //re reversing the list at last
        if(head==null || headSecond==null){
            return true;
        }else{return false;}
    }

    //Q. Reorder List ques
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs= reverseList(mid);
        ListNode hf = head;

        //rearrange
        while(hf!=null && hs!=null){
            ListNode temp = hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        //next of tail to null
        if(hf!=null){
            hf.next=null;

        }
    }

    //Q.
    //Reverse Nodes in k-group
    // it is also reversing the <k end items-> modify it accordingly
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }

        //skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        while(true){
            ListNode last = prev;
            ListNode newEnd = current;

            //reverse b/w left and right
            ListNode next = current.next;
            for(int i=0; current!=null && i<k; i++){
                current.next = prev;
                prev = current;
                current = next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }

            newEnd.next = current;
            if(current==null){
                break;
            }

            prev = newEnd;
        }
        return head;

    }


//    Q. Rotate List
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head==null || head.next==null ){
            return head;
        }

        ListNode last = head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }

        last.next=head;
        int rotations = k%length;
        int skip = length-rotations;
        ListNode newLast = head;
        for(int i= 0; i<skip-1; i++){
            newLast=newLast.next;
        }

        head=newLast.next;
        newLast.next=null;

        return head;

    }

// psvm for qus
    public static void main(String[] args) {
//        LL first = new LL();
//        LL second = new LL()
//        ;

//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);

//        LL ans = LL.merge(first, second);
//        ans.diplay();

        LL list = new LL();
        for(int i=7; i>0; i--){
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();



    }

    //QUESTIONS

//    Q1.
//    Remove Duplicates
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }

        }
        tail = node;
        tail.next = null;
    }


//    Q2.
//    Merge two lists in a new list
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();


        //when both lists are used
        while(f!=null && s!=null){
            if((f.value)<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }

        }

        //either one of them will execute
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;

    }

}

