import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(permute(nums));
    }



    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        for(int i =0; i< nums.length; ++i){
            numList.add(nums[i]);
        }
        addAllPermutation(solList,0, nums.length, numList);
        return solList;
    }

    public static void addAllPermutation(List<List<Integer>> solList, int start, int end, List<Integer> numList){
        if(start==end){

            solList.add(new ArrayList<>(numList));
        }
        else{
            for(int i = start; i<end;++i){
                swap(numList, start, i);
                addAllPermutation(solList, start+1, end, numList);
                swap(numList, start, i);
            }
        }
    }

    public  static void swap(List<Integer> numList, int i, int j){
        int temp = numList.get(i);
        numList.set(i, numList.get(j));
        numList.set(j,temp);
    }
}

