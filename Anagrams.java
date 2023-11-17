import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        int count=0;
        
        if(str1.length()==str2.length())
        {
            for (int i=0;i<str1.length();i++ )
            {
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)!=str2.charAt(j))
                    {
                        continue;
                    }
                    else if(str1.charAt(i)==str2.charAt(j))
                    {
                        count+=1;
                        break;
                    }
                }
            }
        }
        //System.out.println(count);
        if(count==str1.length())
        {
            System.out.println("yes");
        }
        else if( (count!=str1.length()) || (str1.length() != str2.length()) )
        {
            System.out.println("no");
        }
        
        
    }
}
