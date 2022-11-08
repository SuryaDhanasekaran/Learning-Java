public class whileAndDoWhile {
    public static void main(String[] args) {
        boolean ans = isEvenNumber(2);
        System.out.println(ans);
        // int count = 6;
        // while (count != 6) {
        // System.out.println("Count values is " + count);
        // count++;// increment the variable manually
        // }
        // for (int i = 1; i < 7; i++) {// incremented within the loop
        // System.out.println("Count Value is " + i);
        // }
        // for (count = 1; count != 6; count++) {
        // System.out.println("Count Value is " + count);
        // }
        // count = 1;

        // while (true) {
        // if (count == 6) {
        // break;
        // }
        // System.out.println("Count value is " + count);
        // count++;
        // }
        // for (int i = 6; i != 6; i++) {
        // System.out.println("Count value is " + count);
        // }
        // count = 6;
        // do {
        // System.out.println("Count value was " + count);
        // count++;
        // if (count > 100) {
        // break;
        // }
        // } while (count != 6);
        // int number = 4;
        // int finishNumber = 20;
        // while (number <= finishNumber) {
        // number++;
        // if (!isEvenNumber(number)) {
        // continue;
        // }
        // System.out.println("Even number " + number);
        // }
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }

        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            return true;
        }
        return false;
    }

    

}
