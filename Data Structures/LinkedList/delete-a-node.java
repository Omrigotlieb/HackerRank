/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  if (position == 0) {
      return head.next;
      }
    if (head == null){
        return null;
    }
    int counter = 1;
    Node pointer = head;
    while (counter != position){
        counter++;
        pointer = pointer.next;
    }
    pointer.next = pointer.next.next;           
    return head;
}


//Better solution:
Node Delete1(Node head, int position) {
    if (position == 0){ return head.next; }
    head.next = Delete1(head.next, position-1);
    return head;
}