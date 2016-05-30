/* Node is defined as :
class Node
   int data;
   Node left;
   Node right;
   */

static Node lca(Node root, int v1, int v2)
{
    if (root==null) {
        return root;
    } else {
        if (v1>root.data&&v2>root.data) {
            if (root.right==null)
                return root;
            else
                return lca(root.right, v1, v2);
        } else if (v1<root.data&&v2<root.data) {
            if (root.left==null)
                return root;
            else
                return lca(root.left, v1, v2);
        } else {
            return root;
        }
    }
} 
