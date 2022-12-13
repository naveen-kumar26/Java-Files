import java.util.Scanner;
class ArmStrng
{
	int digitCount(int num)
	{
		int count=0;
		while(num>0)
		{
			num /= 10;
			++count;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		ArmStrng a1 = new ArmStrng();
		int value,sum=0,set=0,n1=0;
		System.out.print("Enter a number : ");
		value = s.nextInt();
		int tempV=value;
		int n = a1.digitCount(value);
		System.out.println(n);
		while(value>0)
		{
			n1 = value % 10;
			set = n1;
			for(int i=1; i<n ;i++)
			{
				n1 *= set;
			}
			sum += n1;
			value = value/10;
		}
		if(sum == tempV)
			System.out.println(tempV+" is a armstrong number");
		else
			System.out.println(tempV+" is not a armstrong number");
	}
	
}