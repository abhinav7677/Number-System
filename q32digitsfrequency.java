import java.util.Scanner;
public class q32digitsfrequency {
    public static void main(String[] java){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        System.out.println("Enter Your Number whose frequency needs to be checked");
        int f=sc.nextInt();
        int res=digitfrequency(n,f);
        System.out.println(res);
    }
    public static int digitfrequency(int n,int f){ 
        int rem=0;
        int freq=0;
        while(n>0){rem=n%10; 
        n=n/10;
        if(rem==f){
            freq++;
        }
        }
        
        return freq;
    }
    
}
