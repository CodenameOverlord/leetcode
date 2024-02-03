import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "rat"));
    }
    public static  boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
        char[] cs1 = s.toCharArray();
        char[] cs2 = t.toCharArray();
        Set<Character> cset = new HashSet<>();
        for(int i =0; i< cs1.length;++i){
            Character c = cs1[i];
            if(s1.containsKey(c)){
                s1.put(c, s1.get(c)+1);
            }
            else{
                s1.put(c, 1);
            }
            cset.add(c);
        }
        for(int i =0; i< cs1.length;++i){
            Character c = cs1[i];
            if(s2.containsKey(c)){
                s2.put(c, s2.get(c)+1);
            }
            else{
                s2.put(c, 1);
            }
            cset.add(c);

        }

        for(Character c:cset){
            if(s1.get(c)!=s2.get(c)){
                return false;
            }
        }

        return true;
    }
}
