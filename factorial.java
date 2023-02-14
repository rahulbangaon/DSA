import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scn.nextInt();
        System.out.println("Factorial of num is: "+ fact(n));
        scn.close();
    }
    public static int fact(int num){
        if(num==0)  return 1;
        return num*fact(num-1);
    }

}
