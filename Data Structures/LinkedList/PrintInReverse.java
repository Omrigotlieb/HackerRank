/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

void ReversePrint(Node head) {
   if(head == null) return;
   ReversePrint(head.next);
   System.out.println(head.data);
}