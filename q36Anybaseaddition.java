import java.util.*;
public class q36Anybaseaddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first no.");
        int n1=sc.nextInt();
        System.out.println("Enter your second no.");
        int n2=sc.nextInt();
        System.out.println("Enter your desired base");
        int b=sc.nextInt();
        int res=AnyBaseAddition(n1,n2,b);
        System.out.println("Your added number to the base "+b+" is= "+res);
    }
    public static int AnyBaseAddition(int n1,int n2,int b){
        int rv=0;
        int carry=0;
        int power=1;
        while(n1>0||n2>0||carry>0){
            int rem1=n1%10;
            int rem2=n2%10;
            n1=n1/10;
            n2=n2/10;

            int sum=rem1+rem2+carry;
            carry=sum/b;
            int digit=sum%b;
            rv=rv+digit*power;
            power=power*10;
        }
        return rv;
    } 
}
