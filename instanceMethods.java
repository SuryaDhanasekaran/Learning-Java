class Dog {

    public void bark() {

        System.out.println("woof");
        
    }
    
}

public class instanceMethods{

    public static void main(String[] args) {
        
        Dog rex = new Dog();//create instance
        rex.bark();//call instance method
    }
}
