import java.util.*;
public class q35Anybasetoanybase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int num=sc.nextInt();
        System.out.println("Enter base of your Number");
        int base=sc.nextInt();
        System.out.println("Enter the base you want to convert to");
        int base2=sc.nextInt();
        int res=AnyBasetoAnyBase(num,base,base2);
        System.out.print(res);
    }    

    public static int AnyBasetoAnyBase(int num,int base,int base2){
        int anybasetodecimal=AnyBasetoDecimal(num,base);
        int anydecimaltoanybase=DecimaltoAnyBase(anybasetodecimal,base2);
        return anydecimaltoanybase;
        
    }
    public static int AnyBasetoDecimal(int num, int base){
        int rv=0;
        int power=1;
        while(num>0){
            int rem=num%10;
            num=num/10;
            rv=rv+power*rem;
            power=power*base;
        }
        return rv;
    }
    public static int DecimaltoAnyBase(int num,int base2){
        int rv=0;
        int power=1;
        while(num>0){
            int rem=num%base2;
            num=num/base2;
            rv=rv+rem*power;
            power=power*10;
        }
        return rv;
    }

}
