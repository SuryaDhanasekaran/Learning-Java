import java.util.*;

class SumOfnNum {

    public static void main(String[] args) {

        int n,i,sum;
        sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n:");
        n = sc.nextInt();
        for(i = 1 ; i <= n ; i++)
        {
            sum = sum + i;
        
        }
        System.out.println(sum);


        
    }
}