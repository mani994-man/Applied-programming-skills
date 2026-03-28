import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort keys based on frequency
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Take top k
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = list.get(i);
        }

        return res;
    }
}