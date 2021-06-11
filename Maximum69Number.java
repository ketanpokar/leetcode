// Problem Link : https://leetcode.com/problems/maximum-69-number/

class Maximum69Number {
    public int maximum69Number (int num) {
        int temp = num;
        if(temp/1000 == 6)
            return num+3000;
        else if (temp/1000 != 0)
            temp = temp - 9000;
            
        if(temp/100 == 6)
            return num+300;
        else if (temp/100 != 0)
            temp = temp - 900;
            
        if(temp/10 == 6)
            return num+30;
        else if (temp/10 != 0)
            temp = temp - 90;
            
        if((temp >1 && temp <10) && temp == 6) {
            return num + 3;
        }
        return num;
    }
}
