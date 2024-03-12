import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordDuplicates {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}