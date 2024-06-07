public class Removelowercase {
    public static void main(String args[])
    {
        String input="HelLo JaVa";
        String result=removelowercase(input);
        System.out.println("original string="+input);
        System.out.println("string with lowercase removed="+result);
    }
    public static String removelowercase(String input)
    {
        StringBuilder result=new StringBuilder();
        for (int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if (!Character.isLowerCase(c))
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}
