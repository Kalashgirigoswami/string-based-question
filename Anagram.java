import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String st1,String st2)
    {
        st1=st1.replaceAll("\\s","").toLowerCase();
        st2=st2.replaceAll("\\s","").toLowerCase();
        if (st1.length()!=st2.length())
        {
            return false;
        }
        char[]charArray1=st1.toCharArray();
        char[]charArray2=st2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String args[])
    {
        String st1="listen";
        String st2="silent";
        if (anagram(st1,st2))
        {
            System.out.println(st1+"  and  "+st2+"  are anagram");

        }
        else {
            System.out.println(st1+"  and  "+st2+"  are not anagram");
        }
    }
}
