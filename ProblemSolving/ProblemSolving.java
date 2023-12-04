    import java.util.Scanner;

    public class ProblemSolving {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ProblemSolving obj = new ProblemSolving();
    System.out.println("Enter Number to Count Factors:");
    int num = sc.nextInt();
    int ans = obj.factorCounter(num);
    System.out.println("Number of Factors of given no. is - " + ans);


    sc.close();
    }

    int factorCounter(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
        if(num%i==0)
            count++;
    } 
    return count;
    }
    }