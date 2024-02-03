import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class SumOfElements {
    static int ans;
    static int totalSum;
    static ArrayList<Integer> soln;
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;


        TreeNode(int data, TreeNode left, TreeNode right){

            this.data = data;
            this.left = left;
            this.right = right;
        }

    }


    public static void main(String[] args) {
        TreeNode four  = new TreeNode(3, null, null);
        TreeNode five  = new TreeNode(5, null, null);
        TreeNode six  = new TreeNode(2, null, null);
        TreeNode two  = new TreeNode(8, four, five);
        TreeNode three  = new TreeNode(2, six, null);
        TreeNode one  = new TreeNode(10, two, three);


        int currentSum = 0;
        totalSum = 23;
        returnPossibilities(one,currentSum, new ArrayList<>());
//        System.out.println(ans/2);
        for(int i : soln){
            System.out.println(i);
        }

    }

    private static void returnPossibilities(TreeNode head, int currentSum, ArrayList<Integer> currentList) {
        if(head == null){
            if(currentSum==totalSum){
                soln = new ArrayList<>();
                for(int i : currentList){
                    soln.add(i);
                }
                ans++;
            }
            return;
        }
        if(currentSum+head.data>totalSum){
//            currentList.remove(currentList.size()-1);
            return;
        }
        currentSum += head.data;
        currentList.add(head.data);
        returnPossibilities(head.left,currentSum, currentList);
        returnPossibilities(head.right, currentSum, currentList);
                    currentList.remove(currentList.size()-1);


    }


}
