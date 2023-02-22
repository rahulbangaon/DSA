import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    static public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairsPath(n);
        System.out.println(ans);
        System.out.println("Number of Paths = "+ ans.size());
        scn.close();
    }
    static ArrayList<String> getStairsPath(int n){

        if(n<=0){

            ArrayList<String> baseResult = new ArrayList<>();
            if(n==0){
                baseResult.add("");
                return baseResult;
            }
            else{
                return baseResult;
            }
        }

        ArrayList<String> path1 = getStairsPath(n-1);
        ArrayList<String> path2 = getStairsPath(n-2);

        ArrayList<String> result = new ArrayList<>();
        for(String i: path1){
            result.add(1+i);
        }
        for(String i: path2){
            result.add(2+i);
        }
        return result;
    }
}
