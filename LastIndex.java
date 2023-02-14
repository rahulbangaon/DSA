import java.util.*;
public class LastIndex {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int key = scn.nextInt();
        for(int i=0;i<n;i++) arr[i] = scn.nextInt();
        int ans = lastIndex(arr, 0, key);
        System.out.println(ans);
        scn.close();

    }
    public static int lastIndex(int[] arr, int index,int key){
        if(index==arr.length) return -1;
        int ans = lastIndex(arr,index+1,key);
        if(arr[index] == key && index>ans) ans=index;
        return ans;
    }
}
