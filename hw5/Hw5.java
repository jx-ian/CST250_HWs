package hw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author jiahaoxian
 */

public class Hw5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        URL path = Hw5.class.getResource("happy.txt");
        File happyLyrics = new File(path.getFile());
        Scanner scanHappyLyrics = new Scanner(happyLyrics);
        
        HashSet<String> happySet = new HashSet<>();
        HashMap<String, Integer> happyMap = new HashMap<>();

        while (scanHappyLyrics.hasNext()) {
            String lyrics = scanHappyLyrics.nextLine();

            for (String uniqueWords : lyrics.split(" ")) {
                String cleanLyrics = uniqueWords.toLowerCase().replace(",", "").replace("(", "").replace(")", "");
                
                
                //Program1 -- Count Unique Words
                happySet.add(cleanLyrics);
                
                
                //Program2 -- The word with times repeated
                if (happyMap.containsKey(cleanLyrics)) {
                    happyMap.put(cleanLyrics, happyMap.get(cleanLyrics) + 1);
                }
                else {
                    happyMap.put(cleanLyrics, 1);
                }
            }
        }

        System.out.println("The song Happy contains " + happySet.size() + " unique words.");
        System.out.println(happyMap);
        
        
        //Program3 -- The number of times that "happy" was repeated
        System.out.println("The word 'happy' was repeated " + happyMap.get("happy") + " times.");
        
        
        //Bonus -- Sort unique words by number of times repeated
        List<Entry<String, Integer>> sortHappyMap = new ArrayList<>(happyMap.entrySet());
        sortHappyMap.sort(Entry.comparingByValue());
        
        Map<String, Integer> sortedHappyMap = new LinkedHashMap<>();
        for (Entry <String, Integer> entry : sortHappyMap) {
            sortedHappyMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println(sortedHappyMap);
        
        File sortedHappy = new File("SortedHappyLyricsByNumOccurred.txt");
        FileWriter writeSortedHappy = new FileWriter(sortedHappy, false);   //false -- prevents it from appending the file 
        PrintWriter printSortedHappy = new PrintWriter(writeSortedHappy);
        
        printSortedHappy.println(sortedHappyMap);
        printSortedHappy.close();
    }
}
