public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2000));
    }
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999)
            return false;
        if((year%4 == 0 && year%100 != 0) || year%400 == 0)
            return true;
        else
            return false;
    }
    public static int getDaysInMonth(int month, int year) {
        boolean flag = true;
        flag = isLeapYear(year);
        System.out.println(flag);
        int leap = 0;
        if (flag)
            leap = 1;
        else if (!flag && (year < 1 || year > 9999))
            leap = -1;
        int answer = 0;
        switch (leap) {
            case 0:
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        answer = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        answer = 30;
                        break;
                    case 2:
                        answer = 28;
                        break;
                    default:
                        answer = -1;
                        break;
                }
                break;
            case 1:
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        answer = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        answer = 30;
                        break;
                    case 2:
                        answer = 29;
                        break;
                    default:
                        answer = -1;
                        break;
                }
                break;
            case -1:
                answer = -1;
                break;
        }
        return answer;
    }

}
