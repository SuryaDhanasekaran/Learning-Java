public class BarkingDog {
    public static void main(String[] args) {
        boolean ans = shouldWakeUp(true, -1);
        System.out.println(ans);
        
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay)
    {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23))
        {
            return false;
        }

        return true;
    }
}