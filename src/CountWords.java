import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String inputFile = "input.txt";

        Map<String, Integer> countWordsMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                String word = line.toLowerCase(); 
                countWordsMap.put(word, countWordsMap.getOrDefault(word, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : countWordsMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
