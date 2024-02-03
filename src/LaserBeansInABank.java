public class LaserBeansInABank {

    public static void main(String[] args) {
        String [] strArr = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(strArr));

    }

    public static int numberOfBeams(String[] bank) {
        long ans = 0;
        long prev = 0;
        for(int i = 0; i< bank.length; i++){

            char [] charArr = bank[0].toCharArray();
            long currCount =0;
            for(int j=0; j<charArr.length; ++j){
                if(charArr[j]=='1'){
                    currCount++;
                }
            }
            if(currCount!=0){
                ans+=prev*currCount;
                prev = currCount;
            }
        }

        return (int)ans;
    }
}
