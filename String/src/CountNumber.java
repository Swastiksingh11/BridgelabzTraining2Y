import java.util.*;
public class CountNumber {
    public static void main(String [] args){
        Scanner sc =new Scanner ( System.in);
        int n=sc.nextInt();
        int couunt=Number(n);
        System.out.println(couunt);
    }
    public static int Number(int count) {
        int n=0;
        while(count!=0){
            count=count/10;
            count++;

        }
        return n;
    }
}
