package day3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.*;

public class day3B {
    final static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws Exception {

        FileReader File = new FileReader("src\\day3\\day3data.txt");
        BufferedReader br = new BufferedReader(File);
        String input;

        String output;
        List<String> array = new ArrayList<>();
        int result = 0;
        int i = 0;

        while ((input = br.readLine()) != null) {
            array.add(input);
        }
        int p = 0;
        while (p < (array.size() / 3)) {
            String[] array1 = array.get(i).replace("[", "").replace("]", "").split("");
            Set<String> set1 = new HashSet<>(Arrays.asList(array1));

            String[] array2 = array.get(i + 1).replace("[", "").replace("]", "").split("");
            Set<String> set2 = new HashSet<>(Arrays.asList(array2));

            String[] array3 = array.get(i + 2).replace("[", "").replace("]", "").split("");
            Set<String> set3 = new HashSet<>(Arrays.asList(array3));

            set1.retainAll(set2);
            set1.retainAll(set3);

            p++;
            i = i + 3;

            output = set1.toString().replace("[", "").replace("]", "");
            result = result + 1 + alphabet.indexOf(output);
        }
        System.out.println(result);
    }
}