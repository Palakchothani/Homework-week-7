package homeworkweek7;

import java.util.Scanner;

public class Question6
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the number");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
        s.close();
    }
}
