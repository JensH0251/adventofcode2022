package day4;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class day4B {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("src\\day4\\day4data.txt");
        BufferedReader br = new BufferedReader(file);

        int result = 0;

        int[] stream1;
        int[] stream2;

        String[] array;
        List<String> list;

        String input;
        while ((input = br.readLine()) != null) {
            array = input.split("\\D");

            list = List.of(array);

            stream1 = IntStream.rangeClosed(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1))).toArray();
            stream2 = IntStream.rangeClosed(Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3))).toArray();

            List<Integer> list1 = Arrays.stream(stream1).boxed().collect(Collectors.toList());
            List<Integer> list2 = Arrays.stream(stream2).boxed().collect(Collectors.toList());

            list1.retainAll(list2);

            if (list1.isEmpty())/*element is unique*/ {
                assert true;
            } else /*element has an occurrence in the list after retaining*/ {
                result = result + 1;
            }
        }
        System.out.println(result);
    }
}
