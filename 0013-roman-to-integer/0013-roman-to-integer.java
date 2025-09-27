class Solution {

    static Map<String, Integer> romanLit = new HashMap<>();
    static {
        romanLit.put("I", 1);
        romanLit.put("V", 5);
        romanLit.put("X", 10);
        romanLit.put("L", 50);
        romanLit.put("C", 100);
        romanLit.put("D", 500);
        romanLit.put("M", 1000);
        romanLit.put("IV", 4);
        romanLit.put("IX", 9);
        romanLit.put("XL", 40);
        romanLit.put("XC", 90);
        romanLit.put("CD", 400);
        romanLit.put("CM", 900);
    }

    public int romanToInt(String s) {
        int sum = 0;
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            char cur = ch[i];
            char prev = ' ';
            if (i != 0)
                prev = ch[i - 1];
            //System.out.println("prev: " + prev);
            //System.out.println("cur: " + cur);    
            if (romanLit.containsKey(String.valueOf(prev) + String.valueOf(cur))) {
                sum += romanLit.get((String.valueOf(prev) + String.valueOf(cur)));
                i -= 1;
                continue;
            }
            sum += romanLit.get(String.valueOf(cur));
        }
        return sum;
    }
}