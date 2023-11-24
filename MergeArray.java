import java.util.Scanner;
import java.util.Arrays;
public class MergeArray
{
    public static void main(String[] args) 
    {
	    Scanner s=new Scanner(System.in);
	    int a,b;
	    System.out.println("Enter array A size  : ");
	    a=s.nextInt();
	    
	    System.out.println("Enter array B size : ");
	    b=s.nextInt();
	    
	    int arr[]=new int[a];
	    int brr[]=new int[b];
	    
	    int c=a+b;
	    int crr[]=new int[c];
	    
	    System.out.println("Enter array elements of A: ");
	    for (int i=0;i<a;i++ )
	        arr[i]=s.nextInt();
	        
	    System.out.println("Enter array elements of B: ");
	    for (int i=0;i<b;i++ )
	        brr[i]=s.nextInt();
	        
	    for (int i=0;i<a;i++ )
	        crr[i]=arr[i];
	    for (int i=a,j=0;((i<c) && (j<b));i++,j++ )
	        crr[i]=brr[j];
	        
	    Arrays.sort(crr);
	   
	   for (int i=0;i<c;i++ )
	       System.out.print(crr[i]+" ");
	}
}
