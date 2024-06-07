public class Count {
    public static void  main(String args[])
    {
        String st="welcome the raipur city";
        int count=0;
        for (int i=0;i<st.length();i++)
        {
            if (st.charAt(i)!=0)
                count++;
        }
        System.out.println("total no. of chachter=" +count);
    }
}
