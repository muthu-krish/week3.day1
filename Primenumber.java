package week3.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=41;
boolean flag=false;
for (int i=2;i<=a/2;i++)
{
	if(a%3==0)
	{
		flag=true;
		break;
	}
}
if(flag!=true)
{
	System.out.print("prime number");
}
else
{
	System.out.println("Not prime number");
}
	}

}
