
/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
*/
public class Middle_of_the_Linked_List_876 {
    public ListNode middleNode1(ListNode head) {
        if(head==null || head.next == null){
            return head;
          }
          ListNode fast =head;
          ListNode slow =head;
          while(fast!=null){
              fast=fast.next;
              if(fast!=null){
                  fast=fast.next;
                  slow=slow.next;
              }
          }
          return slow;
      }
      public ListNode middleNode2(ListNode head) {
        int len=size(head);
        if(len==0){
            return head;
        }
        int i=0;
        if(len%2==0){
            len=(len/2);
            while(i++!=len){
                System.out.println(head.val);
                head=head.next;
            }
        }else{
            len=len/2;
            while(i++!=len){
                System.out.println(head.val);
                head=head.next;
            }    
        }
        return head;
    }
    public int size(ListNode head){
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
    return len;
    }
}