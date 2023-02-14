import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter X and n:");
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println("Answer is: "+ powerFun(x, n));
        scn.close();

    }
    public static int powerFun(int x, int n){
        if(n==0) return 1;
        return x*powerFun(x, n-1);
    }
    
}
