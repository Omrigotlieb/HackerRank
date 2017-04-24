/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node temp = new Node();
    temp.data = data;
    temp.next = null;
    Node pointer = head;
    if (pointer == null){
        return temp;
    }
    while(pointer.next != null){
        pointer = pointer.next;
    }
    pointer.next = temp;
    return head;
}
