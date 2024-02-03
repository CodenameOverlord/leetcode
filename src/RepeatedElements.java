import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedElements {
    public static void main(String[] args) {
        Character [] c = {'A','B','C','A','C','K','J','A', 'C','K','P','B','C','A'};
        System.out.println(callfunction(c));
    }

    private static List<Character> callfunction(Character[] in) {
        Set<Character> s = new HashSet<>();
        List<Character> op = new ArrayList<>();
        for(int i =0; i< in.length;++i){
            if(!s.contains(in[i])){
                op.add(in[i]);
            }
            s.add(in[i]);
        }

        return op;

    }

}
