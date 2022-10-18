package homeworkweek7;

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        int year;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year: ");
        year=scan.nextInt();
        if (year%4==0)
        {
            System.out.println(year+ " is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
        scan.close();

    }
}

