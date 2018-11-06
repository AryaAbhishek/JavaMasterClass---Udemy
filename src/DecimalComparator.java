import java.util.*;
public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.456,3.456));
    }
    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2){
        String []str1 = Double.toString(var1).split("\\.");
        String []str2 = Double.toString(var2).split("\\.");
        if (str1[0].equals(str2[0])){
            for(int i=0;i<str1[1].length() && i<3;i++){
                if (str1[1].charAt(i) != str2[1].charAt(i))
                    return false;
            }
            return true;
        }else{
            return false;
        }
    }
}
