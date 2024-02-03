public class Fibo {
    public static void main(String[] args) {


        int [] arr  = new int [5+1];
        printFibo(5,arr);
        for(int i =0; i< arr.length; ++i){
            System.out.println(arr[i]);
        }
    }


    static void printFibo(int x, int arr[]){

        if(x==0 || x==1){
            arr[x]= x;
            return;
        }
        if(arr[x]!=0){
            return;
        }

        printFibo(x-1, arr);printFibo(x-2,arr);
        arr[x]= arr[x-1]+arr[x-2];
        return;


    }
}
