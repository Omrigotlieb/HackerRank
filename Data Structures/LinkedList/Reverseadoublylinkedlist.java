/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head == null) return head;
    Node pointer = head;
    while(pointer.next != null){
        Node temp = pointer.next;
        pointer.next = pointer.prev;
        pointer.prev = temp;
        pointer = temp;
    }
    pointer.next = pointer.prev;
    pointer.prev = null;
    return pointer;
}
