public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }
    public static void printSquareStar(int number){
        if(number<5)
            System.out.println("Invalid Value");
        else {
            for (int i = 1; i <= number; i++) {
                String str = "";
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || j == 1 || i == number || j == number || i == j || j == number - i + 1)
                        str += "*";
                    else
                        str += " ";
                }
                System.out.println(str);
            }
        }
    }
}
