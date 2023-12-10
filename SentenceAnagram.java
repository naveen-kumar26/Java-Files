import java.util.*;
public class Main
{
    public boolean isAnagram(String a,String b)
    {
        boolean result=true;int count=0;
        
        if(a.length()==b.length())
        {
            for (int i=0;i<a.length();i++ )
            {
                for (int j=0;j<b.length() ;j++ )
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        count++;
                    }
                    else if(a.charAt(i)!=b.charAt(j))
                    {
                        continue;
                    }
                }
            }
        }
        if(count==a.length())
            result=true;
        else if((count!=a.length()) || (a.length() != b.length()))
            result=false;
            
        return result;
    }
    
    
    public static void main (String[] args) {
    

        Scanner s=new Scanner(System.in);
        Main m=new Main();
        int flag=0;
        String str=s.nextLine();
    
        String[] ar=str.split(" ",0);
    
        for (int i=0;i<ar.length; i++)
        {
            for (int j=i+1;j<ar.length; j++)
            {
               if(m.isAnagram(ar[i],ar[j]))
               {
                   flag=1;
                   System.out.println("Anagrams are "+ar[i]+" and "+ar[j]);
               }
               
               
            }
        }
        if(flag==0)
            System.out.println("No Anagrams");
    }
}
