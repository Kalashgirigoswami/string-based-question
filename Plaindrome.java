import java.util.Scanner;

public class Plaindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string..");
        String input=sc.nextLine();
        if (isPlaindrome(input))
        {
            System.out.println(input+"  is a plaindrome");

        }
        else {
            System.out.println(input+"  is not plaindrome");
        }
    }
    public static boolean isPlaindrome(String st)
    {
        int left=0;
        int right=st.length()-1;
        while (left < right)
        {
            if (st.charAt(left)!=st.charAt(right))
            {
                return false;

            }
            left++;
            right--;

        }
        return true;
    }
}
