class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : nums){
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((obj1, obj2) -> obj1.fre - obj2.fre);
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            pq.add(new Pair(m.getKey(), m.getValue()));
            if(pq.size() > k){
                pq.poll();
            }
            
        }
        int ret [] = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            ret[i++] = p.val;
        }
        return ret;
    }
}
class Pair{
    int val;
    int fre;
    Pair(int val, int fre){
        this.val = val;
        this.fre = fre;
    }
}