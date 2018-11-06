public class MegaBytesConverter {

    public static void main(String args[]){
        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0)
            System.out.println("Invalid Value");
        else{
            int megaBytes = (int)kiloBytes / 1024;
            int remain = kiloBytes - megaBytes * 1024;
            System.out.println(Integer.toString(kiloBytes)+" KB = "+Integer.toString(megaBytes) + " MB and " + Integer.toString(remain) + " KB");
        }
    }
}
