package day2;

import java.io.*;

import java.util.Objects;

public class day2B {
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

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int win = 6;
        int draw = 3;

        String st;
        while ((st = br.readLine()) != null) {
            String[] split = st.split(" ");
            System.out.println(split[0]);
            System.out.println(split[1]);
            //loss
            if (Objects.equals(split[1], "X")) {
                if (Objects.equals(split[0], "A")) {
                    points = points + scissors;
                }
                if (Objects.equals(split[0], "B")) {
                    points = points + rock;
                }
                if (Objects.equals(split[0], "C")) {
                    points = points + paper;
                }
            }
            //draw
            else if (Objects.equals(split[1], "Y")) {
                if (Objects.equals(split[0], "A")) {
                    points = points + draw + rock;
                }
                if (Objects.equals(split[0], "B")) {
                    points = points + draw + paper;
                }
                if (Objects.equals(split[0], "C")) {
                    points = points + draw + scissors;
                }
            }
            //win
            else if (Objects.equals(split[1], "Z")) {
                if (Objects.equals(split[0], "A")) {
                    points = points + win + paper;
                }
                if (Objects.equals(split[0], "B")) {
                    points = points + win + scissors;
                }
                if (Objects.equals(split[0], "C")) {
                    points = points + win + rock;
                }
            }
        }
        System.out.println(points);
    }
}