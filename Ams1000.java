public class Ams1000 {
    public static void main(String[] args) {
        int n, b, sum = 0;
        System.out.println("Amstrong numbers from i to 1000");
        for(int i = 1;i <= 1000;i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.println(i + " ");
            }
            sum = 0;
        }

    }
}