public class MergeAlternatively {

    public static void main(String[] args) {
        System.out.println(mergeStrings("ab", "wxyz"));
    }

    public static String mergeStrings(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int m = c1.length;
        int n = c2.length;
        int i = 0;
        StringBuilder s = new StringBuilder();
        while (i < Math.max(m, n)) {
            if(i<m){
            s.append(c1[i]);}
            if(i<n){
            s.append(c2[i]);}
            i++;
        }
        return s.toString();
    }
}
