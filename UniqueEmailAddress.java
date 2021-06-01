//Problem link : https://leetcode.com/problems/unique-email-addresses/

import java.util.regex.Pattern;
class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> uniqueEmails = new HashSet<String>();

        for(String email : emails ) {
            String parts[] = email.split("@");
            String localName = parts[0];
            if(parts[0].indexOf("+") != -1) {
                localName = parts[0].substring(0, parts[0].indexOf("+"));
            }
            localName = localName.replaceAll(Pattern.quote("."),"");
            uniqueEmails.add(localName+"@"+parts[1]);
        }
        System.out.println(uniqueEmails);
        return uniqueEmails.size();
        
    }
}
