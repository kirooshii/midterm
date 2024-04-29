package midterm.makar_lavrov_1.task4;

import java.util.List;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        System.out.println("Unique words:");
        System.out.println(uniqueWords);

        Map<Integer, Integer> wordLengthFrequency = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthFrequency.put(length, wordLengthFrequency.getOrDefault(length, 0) + 1);
        }

        System.out.println("\nWord length frequencies:");
        System.out.println(wordLengthFrequency);

        writeToTaskFile(uniqueWords, wordLengthFrequency);
    }

    private static void writeToTaskFile(Set<String> uniqueWords, Map<Integer, Integer> wordLengthFrequency) {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("midterm/makar_lavrov_1/task4/task4.txt");
            java.nio.file.Files.write(path, Arrays.asList("Unique words:", uniqueWords.toString()), java.nio.file.StandardOpenOption.APPEND);
            java.nio.file.Files.write(path, Arrays.asList("\n\nWord length frequencies:", wordLengthFrequency.toString()), java.nio.file.StandardOpenOption.APPEND);
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing to task4.txt: " + e.getMessage());
        }
    }
}
