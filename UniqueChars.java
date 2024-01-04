
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newStr = "";
        boolean chIsInside = false;
        for(int i = 0; i < s.length() ; i++) {
            for(int j = 0 ; j < newStr.length() ; j++){
                if(s.charAt(i) == newStr.charAt(j) && s.charAt(i) != ' ')
                    chIsInside = true;
            }
            if(!chIsInside)
                newStr += s.charAt(i);
            chIsInside = false;
        }
        return newStr;
    }
}
