import java.util.*;

public class RecusiveMinMax {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for( int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Maximum of the Array is: "+max(arr,0));
        System.out.println("Minimum of the Array is: "+min(arr,0));
        scn.close();
    }
    public static int max(int[] arr, int index){
        if(index==arr.length-1) return arr[index];
        int maximum= max(arr, index+1);
        if(maximum>arr[index]) return maximum;
        else return arr[index];
    }
    
    public static int min(int[] arr, int index){
        if(index==arr.length-1) return arr[index];
        int minimum = min(arr,index+1);
        if(minimum<arr[index]) return minimum;
        else return arr[index];
    }
}
