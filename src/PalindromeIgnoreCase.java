public class PalindromeIgnoreCase {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {


        char [] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<c.length; ++i){
            if((c[i]>='a' && c[i]<='z') || (c[i]>='A' &&c[i]<='Z')){
                sb.append(c[i]);
            }
        }
        c= sb.toString().toCharArray();
        int start = 0;
        int end = c.length-1;
        while(start<end){
            if(c[start]==c[end] || ((c[start]^c[end])==32)){
                start++; end--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
