package String;

public class StringUtils {
    public static BigString getTheBiggestStringFromArray(String[] strings){

        if(strings==null || strings.length==0){
            return null;
        }

        int biggestLength=0;
        String values="";

        for (String string:strings){
            if(string.length()>biggestLength){
                biggestLength=string.length();
                values=string;
            }
        }
        return new BigString(biggestLength, values);
    }
}
