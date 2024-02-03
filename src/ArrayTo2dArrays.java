import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTo2dArrays {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(0);
        s.add(1);
        s.add(2);
        s.add(3);
        for (Integer i:s){
            System.out.println(s.toArray());
        }
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        int freq[] = new int[nums.length + 1];

        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            // Store the integer in the list corresponding to its current frequency.
            ans.get(freq[c]).add(c);
            freq[c]++;
        }

        return ans;
    }
}
