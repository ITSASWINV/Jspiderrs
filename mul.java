import java.util.Scanner;
public class mul
 {
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		int n,mul=1,i,gu=1;

		System.out.println("Enter the n value");
		n=ip.nextInt();
		if(n>=2 && n<=20){
		for(i=1;i<=10;i++)
		{
		gu=(n*i);
		System.out.println(n + "*" + i + "=" + gu);
		}}
		else
		System.out.println("error");
	}
 }

