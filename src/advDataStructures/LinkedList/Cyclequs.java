package advDataStructures.LinkedList;

public class Cyclequs {


    // we find whether a ll contains a cycle or not
    // we use the logic of slow and fast pointers
    // if both these pointers meet that means there is a cycle
    public class hasCycle {
        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){return true;}
            }

            // if we have come out of this loop, that means cycle is not present
            return false;

        }
    }

    //find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //calculate the length
                ListNode temp = slow;
                int length=0;
               do{
                   temp=temp.next;
                   length++;
               }while(temp!=slow);
                return length;
            }
        }

        // if we have come out of this loop, that means cycle is not present
        return 0;

    }


    //to find from where the cycle is starting
    // steps:
    //1.Find length of the cycle
    //2. move s ahead by length of cycle times
    //3.move s and f, one by one , till they meet
    public ListNode detectCycle(ListNode head) {
        int length=0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if(length==0){
            return null;
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;

        while(length>0){
            s=s.next;
            length--;
        }

        //keep moving both forward and they will meet at starting point of cycle
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;   //can return anything

    }

    //Q. HAPPY NUMBER
    private int sqr(int num){
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans += rem*rem;
            num/=10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = sqr(slow);
            fast = sqr(sqr(fast));

        }while(fast!=slow);

        if(slow==1){
            return true;
        }
        return false;

    }


//    Q. Find the middle node of the singly linked list
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){               //remember to put && here not ||
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }





}

//      Definition for singly-linked list node for leetcode questions
class ListNode {
    int val;
    ListNode next;

    public ListNode(){}

    ListNode(int x) {
        val = x;
        next = null;
    }
}
