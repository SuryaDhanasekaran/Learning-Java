public class ParsingValuesString {
    public static void main(String[] args) {
        String numberAsString = "2018";// 2018a error
        String doubleAsString = "2018.95";
        System.out.println("numberAsString= " + numberAsString);
        double doublenumber = Double.parseDouble(doubleAsString);
        int number = Integer.parseInt(numberAsString);
        // class called integer wrapper class for type int
        // static method
        System.out.println("number = " + number);
        System.out.println("doublenumber = " + doublenumber);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }

}
