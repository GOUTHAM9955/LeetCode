package dsa.practise.arrays_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MgroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str:strs){
                int[] count = new int[26];
                for(char ch:str.toCharArray()){
                    count[ch-'a']++;
                }
                StringBuffer stringBuffer = new StringBuffer();
                for(int i=0;i<26;i++) {
                    if(count[i]>0){
                        stringBuffer.append((char) i+'a').append(count[i]);
                }
                }
                map.computeIfAbsent(stringBuffer.toString(),k-> new ArrayList<>()).add(str);

        }
            return new ArrayList<>(map.values());
        }
        public static void main(String[] args){
            MgroupAnagrams mgroupAnagrams = new MgroupAnagrams();
            System.out.println(mgroupAnagrams.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));
    }
}
