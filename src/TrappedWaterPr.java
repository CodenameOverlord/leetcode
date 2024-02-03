public class TrappedWaterPr {
    public static void main(String[] args) {
        int [] input = {3,0,0,0,3};
        System.out.println(callFunction(input));
        for(int i =0; i< input.length;++i){
            System.out.println("**"+ input[i]+"***");
        }
    }

    private static int callFunction(int[] input) {
        int leftMax[] = new int [input.length];
        int rightMax[] = new int[input.length];
        if(input.length<=2){
            return 0;
        }
        int length = input.length;
        int max = 0;
        leftMax[0]= input[0];
        for(int i =1; i<length;++i){
            leftMax[i] = Math.max(leftMax[i-1], input[i-1]);
        }
        rightMax[length-1]= input[length-1];
        for(int i =length-2; i>0;--i){
            rightMax[i] = Math.max(rightMax[i+1], input[i+1]);
        }
        int ans= 0;
        for(int i = 0; i<length;++i){
            int current=Math.min(leftMax[i],rightMax[i])-input[i];
            if(current>0){
                ans+=current;
            }
        }

        return  ans;
    }

}
