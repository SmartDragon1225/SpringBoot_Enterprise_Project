package algorithe.test;
public class MyTest {
    public static void main(String[] args) {
        int yera = 1996;
        String s = "1";

    }

    //KMP算法
    public static int index(String str,String match){
        if(str == null || match == null || str.length() == 0 || match.length() == 0){
            return -1;
        }
        char s1[] = str.toCharArray();
        char s2[] = match.toCharArray();
        int s11 = 0,s22 = 0;
        int next[]  = getNext(s2);
        while (s11 < s1.length && s22 < s2.length){
            if(s1[s11] == s2[s22]){
                s11++;s22++;
            }else if(next[s22] == -1){
                s11++;
            }else {
                s22 = next[s22];
            }
        }
        return s22 == s2.length ? s11 - s22 : -1;
    }

    public static int[] getNext(char []s){
        if(s.length == 1){
            return new int[]{-1};
        }
        int next[] = new int[s.length];
        next[0] = -1;
        next[1] = 0;
        int c = 0;
        int i = 2;
        while (i<next.length){
            if(s[c] == s[i-1]){
                next[i++] = ++c;
            }else if(c > 0){
                c = next[c];
            }else {
                next[i++] = 0;
            }
        }
        return next;
    }

    public static int getIndex(String str, String match) {
        if (str == null || match == null || match.length() == 0 || str.length() < match.length())
            return -1;
        char[] strs = str.toCharArray();
        char[] matchs = match.toCharArray();
        int si = 0;
        int mi = 0;
        int[] next = getNextArray(matchs);//获取next数组
        while (si < strs.length && mi < matchs.length) {
            if (strs[si] == matchs[mi]) {//1
                si++;
                mi++;
            } else if (next[mi] == -1) {//3
                si++;
            } else {//2
                mi = next[mi];
            }
        }
        return mi == matchs.length ? si - mi : -1;
    }

    public static int[] getNextArray(char[] ms) {
        if (ms.length == 1)
            return new int[] {-1};
        int[] next = new int[ms.length];
        next[0] = -1;
        next[1] = 0;
        int cn = 0;
        int i = 2;
        while (i < next.length) {
            if (ms[cn] == ms[i - 1]) {
                next[i++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }

}
