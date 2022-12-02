package day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class day1B {

    public static void main(String[] args) throws Exception {

        FileReader File = new FileReader("C:\\Users\\jensh\\IdeaProjects\\adventofcode2022\\src\\day1\\day1data2022.txt");

        BufferedReader br = new BufferedReader(File);

        int totalvalue = 0;


        int first = 0;
        int second = 0;
        int third = 0;

        String i;
        while ((i = br.readLine()) != null) {

            if (i.equals("")) {


                totalvalue = 0;
            } else {
                totalvalue = totalvalue + Integer.parseInt(i);
            }


            if (first < totalvalue) {
                first = totalvalue;

            } else if (second < totalvalue) {
                second = totalvalue;
            } else if (third < totalvalue) {
                third = totalvalue;
            } else {
                assert true;
            }


        }
        System.out.println(first + second + third);

    }


}
