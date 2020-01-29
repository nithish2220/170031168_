public class P26
{
    public static void main(String args[])
    {
        if(args.length==0)
        {
            System.out.println("Please enter an Integer number");
            System.exit(0);
        }
        int num=Integer.parseInt(args[0]);
        int fact=1;
        if(num==0||num==1)
              fact=1;
else{
        do
        {
 
             fact*=num--;
             
        }while(num>=2);
}
        System.out.println("The factorial of "+args[0]+" is "+fact);
    }
}