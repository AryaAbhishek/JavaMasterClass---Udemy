public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,20));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10)
            return -1;
        int temp = first;
        if(first>second)
            temp = second;
        int i = 2;
        int result = 1;
        while(first>1 && second>1 && i<=temp){
            if(first%i ==0 && second%i == 0){
                first = first/i;
                second = second/i;
                result *= i;
            }else{
                i += 1;
            }
        }
        return result;
    }
}
