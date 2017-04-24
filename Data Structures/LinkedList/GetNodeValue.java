/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node pointer = head;
    int size = 0;
    while(pointer != null){
        size++;
        pointer = pointer.next;
    }
    int location = size -1 - n;
    while(location > 0){
        head = head.next;
        location--;
    }
    return head.data;
}
