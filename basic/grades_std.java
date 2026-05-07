package basic;

import java.util.Scanner;

public class grades_std {
    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int marks = sc.nextInt();
                if(marks>=90){
                    System.out.println("grade is A");
                }
                else if (marks <= 89 && marks >= 80){
                    System.out.println("grade is B");
                }
                else if(marks <= 79 && marks >= 70){
                    System.out.println("grade is C");
                }
                else if(marks <= 69 && marks >= 60){
                    System.out.println("grade is D");
                }
        }
    }
}
