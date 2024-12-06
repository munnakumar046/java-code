import java.util.*;

public class Distinct  {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int i : arr) {
            set.add(i);
        }

        set.forEach(element -> System.out.print(element + " "));
    }
}
