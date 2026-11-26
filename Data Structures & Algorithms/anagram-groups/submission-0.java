class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       // if(strs.length <= 1) return Arrays.asList(strs);
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
           char c [] = s.toCharArray();
           Arrays.sort(c);
           String sortedS = new String(c);
           map.putIfAbsent(sortedS, new ArrayList<>());
           map.get(sortedS).add(s);
        }
        List<List<String>> ret = new ArrayList<>();
        for(List<String> list : map.values()){
            ret.add(list);
        }
        return ret;
    }
}
