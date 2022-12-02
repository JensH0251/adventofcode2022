package day2;

import java.io.*;

import java.util.Objects;

public class day2A {
    /**
     * rock = a 1 pt <br>
     * paper = b 2pt <br>
     * scissors = c 3pt <br>
     * <br>
     * win = 6pt <br>
     * loss = 0 pt <br>
     * draw = 3 pt <br>
     * <br>
     * paper = y <br>
     * rock = x <br>
     * scissors = z <br>
     * <br>
     * calculation = win/draw/loss + rock/paper/scissors + current amount of points
     */
    public static void main(String[] args) throws Exception {

        FileReader File = new FileReader("C:\\Users\\jensh\\IdeaProjects\\adventofcode2022\\src\\day2\\day2data.txt");

        BufferedReader br = new BufferedReader(File);

        int points = 0;

        int rock = 1;    //A & X
        int paper = 2;   // B & Y
        int scissors = 3;// C & Z

        int win = 6;
        int draw = 3;

        String st;
        while ((st = br.readLine()) != null) {
            String[] split = st.split(" ");
            System.out.println(split[0]);
            System.out.println(split[1]);

            //rock
            if (Objects.equals(split[0], "A")) {
                if (Objects.equals(split[1], "Y")) {
                    points = points + win + paper;
                }
                if (Objects.equals(split[1], "X")) {
                    points = points + draw + rock;
                }
                if (Objects.equals(split[1], "Z")) {
                    //loss
                    points = points + scissors;
                }
                System.out.println(points);
            }//        opponent \/  \/ you
            // int rock = 1;     A & X
            // int paper = 2;    B & Y
            // int scissors = 3; C & Z
            //paper
            else if (Objects.equals(split[0], "B")) {
                if (Objects.equals(split[1], "Z")) {
                    points = points + win + scissors;
                }
                if (Objects.equals(split[1], "Y")) {
                    points = points + draw + paper;
                }
                if (Objects.equals(split[1], "X")) {
                    //loss
                    points = points + rock ;
                }
                System.out.println(points);
                //scissors
            } else if (Objects.equals(split[0], "C")) {
                if (Objects.equals(split[1], "X")) {
                    points = points + win + rock;
                }
                if (Objects.equals(split[1], "Z")) {
                    points = points + draw + scissors;
                }
                if (Objects.equals(split[1], "Y")) {
                    //loss
                    points = points + paper ;
                }
                System.out.println(points);
            }
        }
        System.out.println(points);

    }
}


