public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes >= 0)
        {
        //caluculates megabytes and remaining kilobytes from the kilobytes parameter
        long megabytes = kiloBytes / 1024;
        int RemainingKilobytes = kiloBytes % 1024;
        System.out.println(kiloBytes+ " KB" + " = " + megabytes  + " MB and " + RemainingKilobytes + " KB");
        }
        else if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        

        
    }
    
}
