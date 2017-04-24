/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    if (head == null) return null;
    Node pointer = head;
    Node prev = head;
    int recent = head.data;
    head = head.next;
    while(head != null){
        if(recent == head.data){
            prev.next = head.next;
         } else {
           prev = prev.next;
        }
        recent = head.data;
        head = head.next;
    }
    return pointer;
}
