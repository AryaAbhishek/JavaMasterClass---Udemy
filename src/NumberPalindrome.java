public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        if (number<0)
            number = Math.abs(number);
        int start = number;
        while(start>0){
            int temp = start%10;
            start = start/10;
            reverse = reverse*10 + temp;
        }
        System.out.println(number);
        System.out.println(reverse);
        if(reverse == number)
            return true;
        else
            return false;
    }
}
