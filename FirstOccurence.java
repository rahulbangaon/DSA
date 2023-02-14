import java.util.*;
class FirstOccurence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = scn.nextInt();
        int ans = fo(arr,0);
        System.out.println(ans);
        scn.close();
    }
    public static int fo(int[] arr, int index){
        int target = 8;
        if(index==arr.length){
            return -1;
        }
        int ans = fo(arr, index+1);
        if(target==arr[index]){
            if(ans>index || ans==-1) return index;
        }
        return ans;
    }
}