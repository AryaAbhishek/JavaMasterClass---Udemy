public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,4,9));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0 || bigCount*5+smallCount*1<goal)
            return false;
        else{
            int tempb = goal/5;
            if (tempb>bigCount)
                goal -= bigCount*5;
            else
                goal -= tempb*5;
            if(goal - smallCount<=0)
                return true;
            else
                return false;
        }
    }
}
