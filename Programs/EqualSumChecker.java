public class EqualSumChecker {
    public static void main(String[] args) {

        boolean ans = hasEqualSum(1, 1, 2);
        System.out.println(ans);
        
    }

    public static boolean hasEqualSum(int first, int second, int third)
    {
        int thirdresult = first + second;
        if(third - thirdresult == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
}
