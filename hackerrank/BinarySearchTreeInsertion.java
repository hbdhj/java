static Node Insert(Node root, int value)
{
    if (root==null) {
        root = Node();
        root.val = value;
        return root;
    } else {
        if (value<root.val) {
            root.left=Insert(root.left, value);
        }
        if (value>root.val) {
            root.right=Insert(root.right, value);
        }
        return root;
    }
}
