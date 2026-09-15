class Solution {
    public String frequencySort(String s) {
        //Step 1 hashmap create and value put
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //Step 2 create ArrayLsit and sort the list using *LAMBA* funstion
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((ob1,ob2) -> map.get(ob2)- map.get(ob1));
        //step 3 store the ans in StringBuilder and return it
        StringBuilder ans = new StringBuilder();
        for(char ch : list){
            ans.append(String.valueOf(ch).repeat(map.get(ch)));
        }
        return ans.toString();
    }
}