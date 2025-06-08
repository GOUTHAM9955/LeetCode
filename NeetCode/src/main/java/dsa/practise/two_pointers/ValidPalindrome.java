package dsa.practise.two_pointers;

public class ValidPalindrome {
    public boolean validPalindrome(String str){
        str = str.replaceAll("[^0-9A-Ba-b]","").toLowerCase();
        int i=0;
        while(i<str.length()/2){
            if (str.charAt(i)!= str.charAt(str.length()-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }
}
