import java.util.*;

public class SortingLambda {
    public static void main(String[] args) {
        // List<String> words = new ArrayList<>(Arrays.asList("cake","banana","watermelon","grapes","muskmelosn","apple"));
        List<String> words=new ArrayList<>();
        words.add("cake");
        words.add("banana");
        words.add("watermelon");
        words.add("grapes");
        words.add("muskmelon");
        words.add("apple");
        // Collections.sort(words,(a,b)->a.compareTo(b)); //asc
        // Collections.sort(words,(a,b)->b.compareTo(a)); //desc
        // words.sort(String::compareTo); // asc // task->change this line to printing in reverse order
        words.sort(Comparator.reverseOrder());
        // words.forEach((i) -> System.out.println(i));
        System.out.println(words);
        


    }
}