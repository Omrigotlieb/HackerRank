 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value){
    Node temp = new Node();
    temp.data = value;
    if(root == null){
       return temp; 
    }
    if(value > root.data){
        if(root.right != null){
            root.right = Insert(root.right, value);
        } else{
            root.right = temp;
        }
    } else {
          if(root.left != null){
            root.left = Insert(root.left, value);
        } else{
            root.left = temp;
        }   
    }
    return root;
}
