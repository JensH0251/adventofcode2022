package day3;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class day3A {

    final static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws Exception {
        FileReader File = new FileReader("C:\\Users\\jensh\\IdeaProjects\\adventofcode2022\\src\\day3\\day3data.txt");
        BufferedReader br = new BufferedReader(File);
        String input;

        String output;

        String[] firarray;
        String[] secarray;

        int result = 0;

        while ((input = br.readLine()) != null) {

            secarray = (input.substring(input.length() / 2).split(""));
            firarray = (input.substring(0, (input.length() / 2)).split(""));

            Set<String> set1 = new HashSet<>(Arrays.asList(firarray));
            Set<String> set2 = new HashSet<>(Arrays.asList(secarray));

            System.out.println(set1);
            set1.retainAll(set2);

            output = set1.toString().replace("[", "").replace("]", "");

            for (int i = 0; i < set1.size(); i++) {
                    result = result + 1 + alphabet.indexOf(output.charAt(i));
            }
        }
        System.out.println(result);
    }
}


