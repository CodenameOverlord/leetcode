import java.util.HashMap;
import java.util.Map;

public class MinNumberOfOperationToMakeArrayEmpty {
    public static void main(String[] args) {
        int [] arr = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(minOperations(arr));
    }
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int max = 0;
        for(int i = 0; i< nums.length; ++i){
            int cN = nums[i];
            max = Math.max(max, cN);
            if(hMap.containsKey(nums[i])){
                hMap.put(cN,hMap.get(cN)+1);
            }
            else{
                hMap.put(cN, 1);
            }
        }
        int [] mem= new  int [max+1];
        int ans = 0;
        for(Integer i: hMap.keySet()){
            if(hMap.get(i)==1){
                return -1;
            }
            else{
                ans+=getMinRep(hMap.get(i), mem);
            }
        }

        return ans;
    }


    public static int minOperations2(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int t = entry.getValue();


            if (t == 1)
                return -1;

            count += t / 3;
            if (t % 3 != 0)
                count++;
        }

        return count;
    }


    static int getMinRep(int x, int [] mem){
        if(x==2 || x==3){
            return 1;
        }
        if(mem[x]!=0){
            return mem[x];
        }

        int op1 = 100000;

        int op2 =10000;
        if(x-2>1){
            op1 = 1+ getMinRep(x-2, mem);
        }
        if(x-3>1){
            op2 = 1+getMinRep(x-3, mem);
        }
        // int op3 =
        mem[x] = Math.min(op1, op2);

        return mem[x];
    }
}
