import java.util.Scanner;

public class SortInputArray {
    public static void main(String[] args){
        int[] arr = getIntegers();
        printArray(arr);
        arr = sortIntegers(arr);
        printArray(arr);
    }
    public static int[] getIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer greater then 0.");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Integer.");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
//        int[] arr1 = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            for (int j = i; j>-1; j--){
                if(j>i){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
