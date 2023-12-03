import java.util.Scanner;

public class BasicProgram {
    public static void main(String[] args) {
        System.out.println("Hello, this is my first program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Variable: ");
        int var = sc.nextInt();
        System.out.println("This is Variable: " + var);
        BasicProgram obj = new BasicProgram();
        obj.isGreater(9, 5);
        sc.close();
    }
    
    public void isGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Num1 is Greater");
        } else{
            System.out.println("Num2 is greater");
        }
    }
}