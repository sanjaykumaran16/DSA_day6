class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null)
            return arr;
        else{
            arr.addAll(postorderTraversal(root.left));
            arr.addAll(postorderTraversal(root.right));
            arr.add(root.val);
        }
        return arr;
        
    }
}
