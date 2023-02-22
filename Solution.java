/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
                List<List<Integer>> mainlist = new LinkedList<List<Integer>>();
                
                if(root!=null){
                    Queue<TreeNode> queue = new LinkedList<>();

                    queue.add(root);
                    while(!queue.isEmpty()){
                        List<Integer> one = new LinkedList<>();
                        int n =queue.size();
                        for(int i=0; i<;i++){
                        TreeNode a = queue.poll();
                        
                        one.add(a.val);
                        if(a.left!=null){
                            queue.add(a.left);
                        }
                        if(a.right!=null){
                            queue.add(a.right);
                        }
                        }
                        mainlist.add(one);
                    }

                     

                }
           
    return mainlist;
    }
}
