public class P24
{
	public static void main(String args[]) {
	   int x=Integer.parseInt(args[0]);
	   int s=0;
	   while(x>0)
	   {
	        s+=x%10;
	        x/=10;
	   }
	   System.out.println("The sum of the digits of "+args[0]+" is "+s);
	}
}