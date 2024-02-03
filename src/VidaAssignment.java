import java.util.*;

public class VidaAssignment {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int input =300;
        System.out.println(findoutput( input));
    }

    private static List<String>  findoutput(int input) {
        List<String> soln = new ArrayList<>() ;
        HashMap<Integer, Set<String>> hashMap = new HashMap<>();
        findSol(hashMap, input);
        for(String i : hashMap.get(input)){
            soln.add(i);
        }

        return soln;
    }

    private static void findSol(HashMap<Integer, Set<String>> hashMap, int input) {
        if(input ==1){
            if(!hashMap.containsKey(input)){
                Set<String> s = new HashSet<>();
                s.add("()");
                hashMap.put(1,s );
                return;
            }

        }
        if(hashMap.containsKey(input)){
            return;
        }
        else{
            HashSet<String> hset = new HashSet<>();

            findSol(hashMap,input-1);
            Set<String> totalCases = hashMap.get(input-1);
            for(String sC: totalCases ){
                hset.add("("+sC+")");
                hset.add("()"+sC);
                hset.add(sC+"()");
            }

            hashMap.put(input, hset);
            return;
        }

    }
}
