/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node pointer = head;
    Node node = new Node();
    node.data = data;
    if (position == 0 || head == null){
       node.next = head;
       return node;
   }
   int counter = 1;
   while(counter != position && pointer.next != null){
       counter++;
       pointer = pointer.next;
    }
    node.next = pointer.next;    
    pointer.next = node;
    return head;
}