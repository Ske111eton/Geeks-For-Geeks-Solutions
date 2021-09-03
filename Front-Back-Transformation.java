class Solution 
{ 
    String convert(String s) 
    {
       StringBuilder ans = new StringBuilder();
       
       for(int i=0; i < (int) s.length(); i++){
           
           char ch = s.charAt(i);
           if(ch >= 'a' && ch <= 'z'){
                ch = (char)('z' -  (ch - 'a'));       
           }
           else{
               ch = (char)('Z' - (ch -'A'));
           }
           ans.append(ch);
       }
       
       return ans.toString();
       
    }
 
} 
