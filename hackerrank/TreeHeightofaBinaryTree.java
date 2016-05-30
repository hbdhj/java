int height(Node root) {
    if (root==null) {
        return 0;
    } else if (root.left==null && root.right==null){
        return 0;
    } else if (root.left!=null && root.right==null){
        return height(root.left)+1;
    } else if (root.left==null && root.right!=null){
        return height(root.right)+1;
    } else (root.left!=null && root.right!=null){
        return max(height(root.left), height(root.right))+1;
    }
}
