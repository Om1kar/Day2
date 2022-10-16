package Day2.WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

}

