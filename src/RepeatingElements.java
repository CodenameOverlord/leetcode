import java.util.HashSet;

public class RepeatingElements {
    public static void main(String[] args) {
        int [] input = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(callFunction(input));
        for(int i =0; i< input.length;++i){
            System.out.println("**"+ input[i]+"***");
        }
    }

    private static int callFunction(int[] input) {

        int startIndex = 0;
        int currentIndex = 1;
        int len = input.length;
        if(len==0|| len==1){
            return len;
        }

        while(startIndex<len && currentIndex<len){
            int currentElement = input[currentIndex];
            if(input[startIndex]==currentElement){
                currentIndex++;
            }
            else{
                startIndex++;
                input[startIndex]=input[currentIndex];
                currentIndex++;
            }

        }

        return startIndex+1;



    }
}
