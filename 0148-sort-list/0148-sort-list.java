/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode thead = head; 
        /*while(head.next != null){  
                             
            while(thead.next != null){
                if(thead.val>thead.next.val){
                    temp = thead.val;
                    thead.val = thead.next.val;
                    thead.next.val = temp;                    
                }
                thead = thead.next;
            }  
            head = head.next;
        }       
            
            */
        List<Integer> arr = new ArrayList<>();
            
        while(thead != null){
            arr.add(thead.val);
            thead = thead.next;
        }

        Collections.sort(arr);
        thead = head; 
        int i =0;
        while(thead != null){
            thead.val = arr.get(i++);
            thead = thead.next;
        }
        
        return head;

    }
}