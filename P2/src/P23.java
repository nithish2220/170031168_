public class P23
{
	public static void main(String args[]) {
	   StringBuffer s=new StringBuffer(args[0]);
	   if(s.reverse().toString().equals(args[0]))
		   System.out.println(args[0]+" is a palindrome");
	   else
		   System.out.println(args[0]+" is not a palindrome");
	}
}