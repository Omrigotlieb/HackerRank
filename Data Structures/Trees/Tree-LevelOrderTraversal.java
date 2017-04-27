   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root){
      Queue<Node> fifo = new LinkedList<Node>();
      fifo.add(root); 
       
      while(!fifo.isEmpty()){
          Node temp = fifo.poll();
          System.out.print(temp.data + " ");
          if(temp.left != null){
              fifo.add(temp.left);
          }
          if(temp.right != null){
              fifo.add(temp.right);
          }
      } 
    }
