import java.util.*;
class Solution {
    public String reverse(String S) {
       Stack <Character> s = new Stack<>();
       int idx =0;
       while(idx<S.length()){
           s.push(S.charAt(idx));
           idx++;
       }
       StringBuilder result = new StringBuilder("");
       while(!s.isEmpty()){
               char curr=s.pop();
               result.append(curr);
              } 
              return result.toString();
        
    }
}