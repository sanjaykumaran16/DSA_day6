class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null)
            return arr;
        else{
            arr.add(root.val);
            arr.addAll(preorderTraversal(root.left));
            arr.addAll(preorderTraversal(root.right));
        }
        return arr;
        
    }
}
