import java.util.Locale;
import java.util.Scanner;

public class Vowelscount {
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string=");
        String input = sc.nextLine().toLowerCase();
        sc.close();
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        System.out.println("no. of vowels in string="+count);
    }
}
