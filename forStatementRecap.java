public class forStatementRecap {
    public static void main(String[] args) {
        for (int number = 1; number < 7; number += 2) {
            System.out.println("number = " + number);
        }
        for (int number = 1; number < 0; number += 2) {// no output
            System.out.println("number = " + number);
        }
        for (int number = 100; number > 0; number += 10) {
            System.out.println("number = " + number);// endless loop
            // program ends when range of the int is reached
        }
    }

}
