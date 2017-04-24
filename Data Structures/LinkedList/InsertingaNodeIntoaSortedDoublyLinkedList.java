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

Node SortedInsert(Node head,int data) {
    Node temp = new Node();
        temp.data = data;
        temp.prev = null;
        temp.next = null;
    if(head == null){
        return temp;
    }
    Node pointer = head;
    Node pointerPrev = head.prev;
    while(pointer != null){
            if(pointer.data > temp.data){
                if(pointerPrev != null){
                    pointerPrev.next = temp;
                    temp.prev = pointerPrev;
                    temp.next = pointer; 
                    pointer.prev = temp;
                    return head;
                } else {
                    head = temp;
                    temp.prev = head.prev;
                    temp.next = pointer;
                    pointer.prev = temp;
                    return head;
                }
            }
            pointerPrev = pointer;
        pointer = pointer.next;

    }
    pointerPrev.next = temp;
    temp.prev = pointerPrev;
    temp.next = pointer;   
    return head;
}
