import java.util.Scanner;
class Diamond {
   public static void main(String args[])  {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the num of lines");
	int num=sc.nextInt();
	int spaces=num/2,stars=1;
	for(int i=1;i<=num;i++)   {
		for(int j=1;j<spaces;j++)
		     System.out.print(" ");
		for(int j=1;j<stars;j++) 
		      System.out.print("*");
		System.out.println();
		if(i<=num/2)
		   {
			spaces--;
			stars+=2;
		   }
		else
		   {
			spaces++;
			stars-=2;
		   }
	}}}