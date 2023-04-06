import java.util.Scanner;
public class q38Anybasemultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int b=sc.nextInt();
        //int res= sumofanybase(n1,n2,b); /for testing sum of base
        //System.out.println(res);        /for testing sum of base
        int res=product(n1,n2,b);
        System.out.println(res);

    }

    public static int product(int n1,int n2,int b){
        int rv=0;
        int power=1;
        while(n2>0){
            int rem1=n2%10; // 2nd digit of n2 
            n2=n2/10;
            int secondproduct=productwithasingledigit(n1,rem1,b); // 2nd digit of n2 with n1 using function
            rv=sumofanybase(rv, secondproduct*power, b);
            power=power*10;
        }
        return rv;
    }


    public static int productwithasingledigit(int n1,int d, int b){
        int rv=0;
        int power=1;
        int c=0;
        while(n1>0 || c>0){
            int rem1=n1%10;
            n1=n1/10;
            int d2=d*rem1+c;
            c=d2/b;
            int digit=d2%b;
            rv=rv+digit*power;
            power=power*10;
        }
        return rv;
    }

    public static int sumofanybase(int n1, int n2, int b){
        int rv=0;
        int c=0;
        int power=1;
        while(n1>0||n2>0||c>0){
            int rem1=n1%10;
            n1=n1/10;
            int rem2=n2%10;
            n2=n2/10;

            int sum=rem1+rem2+c;
            c=sum/b;
            int digit=sum%b; //after carry operation

            rv=rv+digit*power;
            power=power*10;
        }
        return rv;
    }
}
