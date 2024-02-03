import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem17 {

        public static void main(String[] args) {
            int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int splitSize = -25;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

            List<int[]> list = splitArray(original, splitSize);
            list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
        }

        public static List<int[]> splitArray(int[] array, int splitSize) {
//            if(splitSize<0)
            int start = 0;
            int end = array.length-1;
            List<int []> ans =new ArrayList<>();

            while(start<=end){
                if(end-start+1>splitSize){
                    int [] c = new int[splitSize]; int ptr = 0;
                    for(int i =start; i<start+splitSize; ++i){
                        c[ptr]= array[i]; ptr++;
                    }
                    ans.add(c);
                }
                else{
                    int [] c = new int [end-start+1]; int ptr=0;
                    for(int i =start; i<=end; ++i){
                        c[ptr]= array[i]; ptr++;
                    }
                    ans.add(c);
                }
                start+=splitSize;
            }
            return ans;
        }



}
