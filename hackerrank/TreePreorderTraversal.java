/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    if (root!=null) {
        System.out.print(root.data);
        System.out.print(" ");
        if (root.left!=null) {
            preOrder(root.left);
        }
        if (root.right!=null) {
            preOrder(root.right);
        }
    }
}