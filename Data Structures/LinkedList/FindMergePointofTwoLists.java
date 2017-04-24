/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    if(headA == null || headB == null) return 0;
    while(headA != null){
        Node pointer = headB;
        while(pointer != null){
            if(headA.equals(pointer)){
                return headA.data;
            }
            pointer = pointer.next;
        }
        headA = headA.next;
    }
    return 0;
}
