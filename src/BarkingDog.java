public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(bark(true, 22));
    }
    public static boolean bark(boolean barking, int hourOfDay){
        if (hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if (hourOfDay>=8 && hourOfDay<=22){
            if (barking == true){
                return false;
            }else{
                return true;
            }
        }else{
            if (barking == true){
                return true;
            }else{
                return false;
            }
        }
    }
}
