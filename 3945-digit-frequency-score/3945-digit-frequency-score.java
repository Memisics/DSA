class Solution {
    public int digitFrequencyScore(int n) {
        if(n==0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n!=0){
            int rem = n%10;
            if(map.containsKey(rem)){
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
            n=n/10;
        }
        int sum = 0;
        int key = 0;
        int value =0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            key = entry.getKey();
            value = entry.getValue();
            sum = sum+key*value;
        }
        return sum;
    }
}