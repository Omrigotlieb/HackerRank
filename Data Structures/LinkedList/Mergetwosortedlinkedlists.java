/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    if(headA == null) return headB;
    if(headB == null) return headA;
    Node pointer = new Node();
    Node result = pointer;
    while((headA != null) && (headB != null)){
        if(headA.data < headB.data){
            pointer.data = headA.data;
            headA = headA.next;
        } else {
            pointer.data = headB.data;
            headB = headB.next;
        }
        pointer.next = new Node();
        pointer = pointer.next;
    }
    if(headA == null){
        pointer.data = headB.data;
        pointer.next = headB.next;
    } else{
        pointer.data = headA.data;
        pointer.next = headA.next;
    }
    return result;
}
