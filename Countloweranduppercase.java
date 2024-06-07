public class Countloweranduppercase {
    public static void main(String args[])
    {
        String input="Hello WorLD To INDIA";
        int lowercase=0;
        int uppercase=0;
        for (int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if (Character.isLowerCase(ch))
            {
                lowercase++;

            } else if (Character.isUpperCase(ch)) {
                uppercase++;

            }
        }
        System.out.println("string="+input);
        System.out.println("lower case total char="+lowercase);
        System.out.println("upper case total char="+uppercase);
    }
}
