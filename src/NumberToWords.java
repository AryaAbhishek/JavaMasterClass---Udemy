public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(10);
    }
    public static int reverse(int number){
        int result = 0;
        int flag = 1;
        if (number<0){
            flag = -1;
            number *= -1;
        }
        while(number>0){
            result = result * 10 + number%10;
            number /= 10;
        }
        return flag*result;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number<0)
            return -1;
        if(number==0)
            return 1;
        while(number>0){
            count++;
            number /= 10;
        }
        return count;
    }
    public static void numberToWords(int number){
        int count = getDigitCount(number);
        number = reverse(number);
        if(number<0)
            System.out.println("Invalid Value");
        while(count>0){
            int temp = number%10;
            number /= 10;
            switch(temp){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count--;
        }

    }
}
