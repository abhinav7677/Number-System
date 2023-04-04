import java.util.Scanner;
public class q34AnybasetoDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=sc.nextInt();
        System.out.println("Enter the base of your Number");
        int b=sc.nextInt();
        int res=anybasetodecimal(n, b);
        System.out.println(res);
        }
        public static int anybasetodecimal(int n,int b){
            int rv=0;
            int power=1;
            while(n>0){
                int rem=n%10;
                n=n/10;
                rv=rv+rem*power;
                power=power*b;
            }
            return rv;
    }
}
