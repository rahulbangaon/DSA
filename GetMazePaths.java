import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    static public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePaths(1,1,n,m);
        System.out.println(ans);
        System.out.println("Number of Paths: "+ ans.size());
        scn.close();
    }
    static ArrayList<String> getMazePaths(int row ,int col , int n , int m){
        if(row >= n && col >=m){
            ArrayList<String> baseResult = new ArrayList<>();
            if(row==n && col==m){
                baseResult.add("");
                return baseResult;
            }
            else{
                return baseResult;
            }
        }
        
        ArrayList<String> rPath = new ArrayList<>();
        ArrayList<String> cPath = new ArrayList<>();

        if(row<n){
            rPath = getMazePaths(row+1, col, n, m);

        }
        if(col<m){
            cPath = getMazePaths(row, col+1, n, m);

        }

        ArrayList<String> result = new ArrayList<>();

        for(String i: rPath){
            result.add('r'+i);
        }
        for(String i: cPath){
            result.add('c'+i);
        }

        return result;

    }
}
