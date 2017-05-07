//     Author: Omri Gotlieb
//     Github: https://github.com/Omrigotlieb
//     HackerRank: https://www.hackerrank.com/omrigotlieb
//     Portfolio: http://omrigotlieb.com/


/* Node is defined as :
class Node
   int data;
   Node left;
   Node right;

   */

static Node lca(Node root, int v1, int v2) {
  if (v1 > v2) {
    int temp = v1;
    v1 = v2;
    v2 = temp;
  }
  if (root == null) return root;
  if (root.data > v1 && root.data > v2) {
    return lca(root.left,  v1,  v2);
  }
  if (root.data < v1 && root.data < v2) {
    return lca(root.right, v1, v2);
  }
  if (root.data >= v1 && root.data <= v2) {
    return root;
  }
return null;
}





