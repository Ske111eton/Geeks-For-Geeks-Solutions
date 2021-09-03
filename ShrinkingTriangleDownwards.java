class Solution {
    static String triDownwards(String S){
        String ans = "";
        int n = S.length()-1;
        for(int i=0; i<=n; i++){
            String res = "";
            for(int j=0; j<=i-1; j++){
                res += '.';
            }
            
            for(int j=i; j<=n; j++){
                res += S.charAt(j);
            }
            ans = ans.concat(res);
        }
        return ans;
    }
}
