public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int a, int b){
        if(a<10 || a>99 || b<10 || b>99)
            return false;
        int tempa1 = a%10;
        int tempa2 = a/10;
        int tempb1 = b%10;
        int tempb2 = b/10;
        if(tempa1 == tempb1 || tempa1 == tempb2 || tempa2 == tempb1 || tempa2 == tempb2)
            return true;
        else
            return false;
    }
}
