public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12,15,22));
    }
    public static boolean hasSameLastDigit(int a,int b,int c){
        if(a<10 || b<10 ||c<10 ||a>1000||b>1000||c>1000)
            return false;
        int tempa = a%10;
        int tempb = b%10;
        int tempc = c%10;
        if(tempa == tempb || tempb == tempc || tempc == tempa)
            return true;
        else
            return false;
    }
}
