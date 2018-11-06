public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0)
            return -1;
        int start = 0;
        int end = 0;
        int count = 0;
        while(number>0){
            if (count == 0 && number>10){
                end = number%10;
                count += 1;
            }else if(count == 0 && number<10){
                end = number;
                start = number;
                count += 1;
            }else if(count>0 && number<10){
                start = number;
                count += 1;
            }else{
                count += 1;
            }
            number = number/10;
        }
        return start+end;
    }
}
