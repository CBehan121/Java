import java.lang.Math;
class Solution {
    public int reverse(int x) {
        String newstring = "";
        String flip = "";
        if(x >=  Math.pow(2,31) || x <= Math.pow(2,31)*-1){
            return 0;
        }
        String newnum = String.valueOf(x);
        for(int i = newnum.length() -1; i >= 0; i--){
        char charAtZero = newnum.charAt(i);
        newstring += Character.toString(charAtZero);   
        }
        String letter = Character.toString(newstring.charAt(newstring.length()-1));
        if(letter.matches("-")){
            flip = newstring.substring(0,newstring.length()-1);
            Integer lip = Integer.valueOf(flip);
            lip = lip * -1;
            return lip;
        }
    
        
        int lip = Integer.parseInt(newstring);  
        return lip;
    }
}
