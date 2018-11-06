public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number){
        if(number<=1)
            return -1;
        int i = 2;
        int result = -1;
        while(i<=number){
            if(number%i==0){
                boolean flag =true;
                for(int j = 2 ;j<Math.floor(Math.sqrt(i)+1);j++){
                    if(i%j == 0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    result = i;
                }
            }
            i++;
        }
        return result;
    }
//    public static boolean isPrime(int a){
//        for(int i = 2 ;i<Math.floor(Math.sqrt(a)+1);i++){
//            if(a%i == 0)
//                return false;
//        }
//        return true;
//    }
//    public static int getLargestPrime(int number){
//        if(number<=1)
//            return -1;
//        int i = 2;
//        int result = -1;
//        while(i<=number){
//            if(number%i==0){
//                boolean flag = isPrime(i);
//                if(flag){
//                    result = i;
//                }
//            }
//            i++;
//        }
//        return result;
//    }
}
