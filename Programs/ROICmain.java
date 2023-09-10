public class ROICmain {

    public static void main(String[] args) {

        ROIC bluehouse = new ROIC("blue");
        ROIC anotherhouse = bluehouse;

        System.out.println(bluehouse.getColor());
        System.out.println(anotherhouse.getColor());

        anotherhouse.setColor("red");
        System.out.println(bluehouse.getColor());
        System.out.println(anotherhouse.getColor());

        ROIC greenHouse = new ROIC("green");
        anotherhouse = greenHouse;

        System.out.println(bluehouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherhouse.getColor());

    }
    
}
