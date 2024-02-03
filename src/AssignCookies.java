import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class AssignCookies {
    public static void main(String[] args) {
        int [] greed = {10,9,8,7};
        int [] size = {5,6,7,8};
        System.out.println(findContentChildren(greed, size));
    }

    private static int findContentChildren(int[] g, int[] s) {

        PriorityQueue<Integer> pqG = new PriorityQueue<>();
        PriorityQueue<Integer> pqS = new PriorityQueue<>();

        for(int i =0; i< g.length; ++i){
            pqG.add(g[i]);
        }
        for(int i =0; i< s.length; ++i){
            pqS.add(s[i]);
        }

        int ans = 0;
        while(pqS.size()>0 && pqG.size()>0){
            int greedCurr = pqG.remove();
            int sizeCurr = pqS.remove();
            System.out.println("removed pg "+ greedCurr);
            System.out.println("removed ps "+ sizeCurr);

            if(greedCurr<=sizeCurr){
                ans++;
            }
            else{
                while(pqS.size()>0 && greedCurr>pqS.peek()){
                    pqS.poll();
                }
            }
        }
        return ans;

    }


}
