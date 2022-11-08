public class LeapYear{
    public static void main(String[] args) {
        boolean ans = isLeapYear(1600);
        System.out.println(ans);
        
    }
    public static boolean isLeapYear(int year) 
    {
            if (year < 1 || year > 9999) {
                return false;
            } else if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else return year % 100 == 0 && year % 400 == 0;
    }
    
    

    
}
