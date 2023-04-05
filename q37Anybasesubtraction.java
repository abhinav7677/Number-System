import java.util.Scanner;
public class q37Anybasesubtraction {
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int largenum=sc.nextInt();
    int smallnum=sc.nextInt();
    int base=sc.nextInt();
    int result=substrationofanybase(largenum,smallnum,base);
    System.out.print(result);
    }
    public static int substrationofanybase(int largenum, int smallnum, int base){
        int rv=0;
        int carry=0;
        int power=1;
        
        while(largenum>0){
            int rem1=largenum%10;
            int rem2=smallnum%10;
            largenum=largenum/10;
            smallnum=smallnum/10;
            
            int diff=0;
            rem1=rem1+carry;

            if(rem1>=rem2){
                carry=0;
            diff=rem1-rem2;
            }
            else{
                carry=-1;
            diff=rem1+base-rem2;
            }
            rv=rv+diff*power;
            power=power*10;
        }
    return rv;
    }
}
