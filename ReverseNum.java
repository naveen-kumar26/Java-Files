import java.util.Scanner;
class ReverseNum
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num,num1=0,numr=0;
		System.out.print("Enter a number : ");
		num = s.nextInt();
		while(num>0)
		{
			num1 = num%10;
			//System.out.print(num1);
			numr = (numr*10)+num1;
			num /= 10;
		}
		System.out.print("result : "+numr);
	}
}
