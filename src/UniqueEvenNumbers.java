import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> uniqueEvenNumbers = new HashSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        for (int num : uniqueEvenNumbers) {
            System.out.println(num);
        }
    }
}
