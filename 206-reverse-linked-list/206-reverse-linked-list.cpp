/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head==NULL) return head;
       ListNode *current = head; 
        ListNode *nexty = head->next;
         ListNode *prev = NULL ;
        while(current->next != NULL){
            current->next = prev;
            prev = current;
            current = nexty;
            nexty = nexty->next;                       
        }
        current->next= prev;
        prev = current;
        current = NULL;
        
        return prev;
    }
};