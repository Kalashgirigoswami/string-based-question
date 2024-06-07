//remove duplicates string
public class Duplicates {
    public static void Duplicates(String st)
    {
        String str=new String();
        int length=st.length();
        for (int i=0;i<length;i++)
        {
            char ch=st.charAt(i);
            if (str.indexOf(ch)<0)
            {
                str+=ch;
            }
        }
        System.out.println(str);
    }
    public static void main(String args[])
    {
        String str1="welcome";
        Duplicates(str1);
    }
}
