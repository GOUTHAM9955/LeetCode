package dsa.practise.arrays_hashing;

import java.util.HashSet;

public class ContainsDuplicate {

    boolean duplicateChecker(int[] list){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : list){
            if(hashSet.contains(i)){
                return false;
            }
            else{
                hashSet.add(i);
            }
        }
        return true;
    }
}
