package homeworkweek7;

import java.util.Scanner;

public class Question1
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Input number");
        int a = s.nextInt();

        String answer= a%2==0 ? "Even" : "Odd";
        System.out.println(a + "is" + answer);
        s.close();
    }
}
