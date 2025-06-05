package dsa.practise.arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs){
        String finalString = "";
        for (String str: strs){
            finalString+=(str.length()+"#"+str);
        }
        return finalString;
    }

    public List<String> decode(String str){
        List<String> listOfStrings = new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int lengthOfString = Integer.parseInt(str.substring(i,j));
            j++;
           listOfStrings.add(str.substring(j,j+lengthOfString));
           i=j+lengthOfString;
        }
        return listOfStrings;
    }

    public static void main(String[] args){
        EncodeAndDecodeStrings obj = new EncodeAndDecodeStrings();
        System.out.println( obj.encode(Arrays.asList("gotham","kakani","123")));
        System.out.println(obj.decode(obj.encode(Arrays.asList("gotham","kakani","123"))));
    }
}
