import java.util.*;
public class GetSubsquenceOfString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> result = gss(str);
        System.out.print(result);
        scn.close();
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> strlist = new ArrayList<>();        //base case me ek list return krne ke liye list bnai
            strlist.add("");                                       // ek khali string element list me kiya or return kr diya
            return strlist;
        }
        
        char ch= str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> result = gss(ros);

        ArrayList<String> finalResult = new ArrayList<>();
        for(String s: result){
            finalResult.add(""+s);                              //ek baar bina ch add kiye finalResult me result ka string element add kiya
        }
        for(String s: result){
            finalResult.add(ch+s);                              // ek baar ch add kiya result ke string element me or finalResult me add kr diya
        }
        return finalResult;

    }


}
