public class P22
{
	public static void main(String args[]) {
           if(args.length==0){
              System.out.println("Please enter an integer number");
              System.exit(0);}
           int n=Integer.parseInt(args[0]);
  
	    if(n==1 || n==0){
	      System.out.println(n+" is neither prime nor composite");
              System.exit(0);
             }
            int c=0;
	    for(int i=2;i<=n/2;i++)
	   {
	       if(n%i==0){
                 System.out.println(n+" is not a prime number");
	         c=1;
	         break;
              }
	   }
	   if(c==0)
	      System.out.println(n+" is a prime number");
 
	}
}