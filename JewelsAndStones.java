    /**
     * 统计J字符串中的字母在S中出现的次数
     *
     * You're given strings J representing the types of stones that are jewels, 
     * and S representing the stones you have.  Each character in S is a type of stone you have. 
     * You want to know how many of the stones you have are also jewels.
     *
     * The letters in J are guaranteed distinct, and all characters in J and S are letters. 
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     *
     *Example 1:
     *
     *Input: J = "aA", S = "aAAbbbb"
     *Output: 3
     *
     *Example 2:
     *
     *Input: J = "z", S = "ZZ"
     *Output: 0
     * 
     */
     
     public class JewelsAndStones1 {
        public int numJewelsInStones(String J, String S) {
        int lenJ = J.length();
        int lenS = S.length();
        int r = 0;
        for (int i = 0; i < lenJ; i++) {
            for (int j = 0; j < lenS; j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    r++;
                }
            }
        }
        return r;
        }
     }
     
     public int numJewelsInStones(String J, String S) {
        Set<Integer> jewels = J.chars().boxed().collect(Collectors.toSet());
          return (int) S.chars().filter(jewels::contains).count();
      }
    }
    
