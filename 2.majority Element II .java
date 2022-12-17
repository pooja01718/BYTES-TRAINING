class Solution {
    public List<Integer> majorityElement(int[] n) {
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<>();
        for(int i:n)map.put(i,map.getOrDefault(i,0)+1);
        int t=n.length/3;
        for(int s:map.keySet()){
            if(map.get(s)>t)l.add(s);
        }
        return l;
    }
