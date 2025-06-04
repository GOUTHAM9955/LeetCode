package dsa.practise.arrays_hashing;
import java.util.*;
import java.util.HashMap;

public class TopKFrequentElements {
        public int[] topKFrequent(int[] nums, int k){
            Map<Integer, Integer> hashMap = new HashMap<>();
            for (int num: nums){
                hashMap.put(num,hashMap.getOrDefault(num,0)+1);
            }

            PriorityQueue<int []> priorityQueue = new PriorityQueue<>((a,b)->a[1]-b[1]);

            for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
                priorityQueue.offer(new int[]{entry.getKey(),entry.getValue()});
                if(priorityQueue.size()>k){
                    priorityQueue.poll();
                }

            }
            int[] result = new int[k];
            for(int i=0; i<k; i++){
                result[i] = priorityQueue.poll()[0];
            }
            return result;
        }
}
