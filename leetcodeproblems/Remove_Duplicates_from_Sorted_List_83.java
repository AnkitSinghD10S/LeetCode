public class Remove_Duplicates_from_Sorted_List_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node= head;
        while(node!=null && node.next!= null){
                if(node.val==node.next.val){
                node.next=node.next.next;
                }else{
                    node=node.next;
                }
        }
            return head;
        }
    public class ListNode{
        ListNode next;
        int val;
        ListNode(int x){
            this.val=x;
            ListNode next=null;
        }
    }
    public static void main(String[] args) {
        
    }
}