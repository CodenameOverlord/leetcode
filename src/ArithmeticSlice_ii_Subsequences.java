import java.util.ArrayList;

public class ArithmeticSlice_ii_Subsequences {
    public static int numberOfArithmeticSlices(int[] nums) {
        int totalCases = 2<<nums.length;
        int ans = 0;
        for(int i = 0; i<totalCases; ++i){
            ArrayList<Integer> arrlist = new ArrayList<>();
            for(int j=0; j<nums.length; ++j){
                if((i^j)>=1){
                    arrlist.add(nums[j]);
                }
            }
            if(arrlist.size()>=3)
                ans+=checkSeq(arrlist);
        }




        return ans;

    }

    static int checkSeq(ArrayList<Integer>a){
        int diff = a.get(1)-a.get(0);
        for(int i = 1; i< a.size(); ++i){
            if(a.get(i)-a.get(i-1)!=diff){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int [] nums  = {2,4,6,8,10};
        System.out.println(numberOfArithmeticSlices(nums));
    }
}
