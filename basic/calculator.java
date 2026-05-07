package basic;

import java.util.Scanner;

public class calculator {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();



        int sum = num1 + num2;
        System.out.println(sum);
        int sub = num1 - num2;
        System.out.println(sub);
        float multi = num1 * num2;
        System.out.println(multi);
        float div = num1 / num2;
        System.out.println(div);
    }

}
