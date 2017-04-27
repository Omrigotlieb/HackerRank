/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root){
    Node pointer = root;
    int counter = 0;
    while(counter <= S.length()){
        if(pointer.data != '\0'){
            System.out.print(pointer.data);
            pointer = root;
            continue;
        }
        if(counter == S.length()){
            return;
        }
        if(S.charAt(counter) == '1'){
            counter++;
            pointer = pointer.right;
            continue;
        }
        if(S.charAt(counter) == '0'){
            counter++;
            pointer = pointer.left;
            continue;
        }
    }

       
    }
