package 算法训练.算法练习第五天5月16日;

public class 最长公共子序列 {
    public static void main(String[] args) {
        System.out.println(new 最长公共子序列().LCS("1A2C3D4B56", "B1D23A456A"));
    }
    /**
     * longest common subsequence
     * @param s1 string字符串 the string
     * @param s2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 == 0 || len2 == 0)
            return "-1";
        int[][] dp = new int[len1+1][len2+1]; //动态规划思想
        for(int i = 0; i < len1+1; i++){
            for(int j = 0; j < len2+1; j++){
                //初始化行列第一个元素
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                    continue;
                }
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        //找出一个最长的公共子序列
        StringBuilder sb = new StringBuilder();
        int s1L = len1, s2L = len2;
        while(s1L != 0 && s2L != 0){
            if (s1.charAt(s1L-1) == s2.charAt(s2L-1)){
                sb.append(s1.charAt(s1L - 1));
                s1L--;
                s2L--;
            }else{
                if (dp[s1L-1][s2L] > dp[s1L][s2L-1]){
                    s1L--;
                }else{
                    s2L--;
                }
            }
        }
        if(sb.length() == 0)
            return "-1";
        return sb.reverse().toString();
    }
}
