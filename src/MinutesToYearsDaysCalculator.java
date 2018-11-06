public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(3652343);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes<0)
            System.out.println("Invalid Value");
        else{
            long years = minutes/(60*24*365);
            long days = (minutes - years*60*24*365)/(60*24);
            String result =  Long.toString(minutes)+" min = "+Long.toString(years)+" y and "+Long.toString(days)+" d";
            System.out.println(result);
        }
    }
}
