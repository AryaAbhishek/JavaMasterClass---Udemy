public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345));
    }
    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        int result = 0;
        while(number>0){
            int temp = number%10;
            if (temp%2 == 0)
                result += temp;
            number = number/10;
        }
        return result;
    }
}
