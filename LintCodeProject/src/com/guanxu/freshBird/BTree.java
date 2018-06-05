package com.guanxu.freshBird;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTreeBuilder builder = BTreeBuilder.getInstance();
		TreeNode root;
		int[] a = {1,2,3,4,5,6,7,8};
		root = builder.create(new TreeNode(), a ,0);
//		printTree(root);
//		System.out.println(".........");
//		printTree(maxNode(root));
//		System.out.println(minDepth(root));
		printTree(root);
		System.out.println("...............");
		printTreeLNR(root);
//		System.out.print(isNull(root.left));
//		System.out.print(root.right);
		
	}
	
	public void flatten(TreeNode root) {
		if(root == null)
			return;
		if(root.left == null && root.right == null) 
			return;
		if(root.left == null) {
			flatten(root.right);
			return;
		}
		if(root.right == null) {
			root.right = root.left;
			root.left = null;
			flatten(root.right);
			return;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.right = root.left;
		flatten(left);
		TreeNode re = left;
		while(re.right != null) {
			re = re.right;
		}
		re.right = right;
		flatten(right);
		root.left = null;
	}

	public static void printTree(TreeNode root){
		if(root != null && root.val != 0) {
			System.out.println(root.index +":"+root.val);
			printTree(root.left);
			printTree(root.right);
		}
	}
	
	public static void printTreeLNR(TreeNode root) {
		if(root != null && root.val != 0) {
			printTreeLNR(root.left);
			System.out.println(root.index +":"+root.val);
			printTreeLNR(root.right);
		}
	}
	
	public static List<Integer> printTreeLNRNoRecursion(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> nodeStack = new Stack<>();
		while(root != null || !nodeStack.isEmpty()) {
			while(root!= null) {
				nodeStack.push(root);
				root = root.left;
			}
			root = nodeStack.pop();
			result.add(root.val);
			root = root.right;
		}
		return result;
	}
	
    public static TreeNode maxNode(TreeNode root) {
        // write your code here
        if(root == null)
            return null;
        TreeNode r, l;
        l = maxNode(root.right);
        r = maxNode(root.left);
        if(l != null){
            if(root.val < l.val){
                root = l;
            }
        }
        if(r != null){
            if(root.val < r.val){
                root = r;
            }
        }
        return root;
    }
    
    public static int maxDepth(TreeNode root) {
        // write your code here
    	int left = 0, right = 0;
    	if(root == null) return 0;
    	left = maxDepth(root.left);
    	right = maxDepth(root.right);
    	return (root.left == null || root.right == null)?left + right + 1:Math.max(left, right) + 1;
    }
    
    public static int minDepth(TreeNode root) {
    	int left = 0, right = 0;
    	if(root == null) return 0;
    	left = minDepth(root.left);
    	right = minDepth(root.right);
    	return (root.left == null || root.right == null)?left + right + 1:Math.min(left, right) + 1;
    }
    
    public static boolean isNull(TreeNode node) {
    	return node == null;
    }
    
    public static class BTreeBuilder{
 	   
 	   private static BTreeBuilder instance;
 	   
 	   public static BTreeBuilder getInstance() {
 		   if(instance == null)
 			   return instance = new BTreeBuilder();
 		   return instance;
 	   }
 	   
 	   public TreeNode create(TreeNode root, int[] data, int index) {
 		   if(data.length > index) {
 			   if(data[index] == 0){
 				   root = null;
 			   }else {
 				   TreeNode r = new TreeNode();
 				   TreeNode l = new TreeNode();
 				   root.val = data[index];
 				   root.index = index;
 				   root.left = create(l, data, index*2+1);
 				   root.right = create(r, data, index*2+2);
 			   }
 			  return root;
 		   }
 		   return null;
 	   }
    }
    
	   public static class TreeNode {
 	       public int val;
 	       public int index;
 	       public TreeNode left, right;
 	       public TreeNode() {}
 	       public TreeNode(int val) {
 	           this.val = val;
 	           this.left = this.right = null;
 	       }
 	   }
	
}

//  Definition of TreeNode:

   
