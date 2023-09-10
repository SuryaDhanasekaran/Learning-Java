public class InsVariable {

    private String name;

    public InsVariable(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }

    public class Main{
        public static void main(String[] args) {
            
            InsVariable rex = new InsVariable("rex");
            InsVariable  ramu = new InsVariable("ramu");
            rex.printName();//rex
            ramu.printName();//ramu
        }
    }
    
}
