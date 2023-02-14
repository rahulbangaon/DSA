import java.util.*;
public class AllIndicies {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int key = scn.nextInt();
        for( int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int[] ans= allIndex(arr,0,key,0);

        if(ans.length==0) System.out.println("Element not present");

        for(int i=0;i<ans.length;i++) System.out.print(ans[i]+" ");


        scn.close();
    }

    public static int[] allIndex(int[] arr,int index,int key,int fsf){
        if(index==arr.length){
            return new int[fsf];
        }
        if(arr[index]==key){
            int[] iarr = allIndex(arr, index+1, key, fsf+1); // jaate time agr element h to index or  fsf bdha raha h
            iarr[fsf]=index; // aate time nye array me index daal kr return kr rha h
            return iarr;
        }
        else{
            int[] iarr = allIndex(arr, index+1, key, fsf); // jaate time sirf index bdha rha h
            return iarr; // wapis aate time sirf array return kr rha h
        }

    }
}
