import java.util.Scanner;
public class q33decimaltoabase {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Number");
    int num=sc.nextInt();
    System.out.println("Enter the base of the Number");
    int base=sc.nextInt();
    int res=numtobase(num,base);
    System.out.println(res);
}    
public static int numtobase(int num,int base){
    int rv=0;
    int power=1;
    while(num>0){
        int rem=num%base;
        num=num/base;
        rv=rv+rem*power;
        power=power*10;
        }
        return rv;
}
}
