public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number){
        if(number<1)
            return false;
        int i = 1;
        int result = 0;
        while(i<number){
            if(number%i == 0)
                result += i;
            i++;
        }
        if(result==number)
            return true;
        return false;
    }
}
