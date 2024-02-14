public class Increment {

    public static void main(String[] args) {
        int count = 1;
        // count = count + 1;
        count++;//Post increment
        count--;//Post decrement
        --count;//Pre decrement
        ++count;//Pre increment

        //Pre increment immediately increments the value
        //Pre decrement immediately decrements the value


        //Post increment do not increment the value suddenly it increments the value after the operation
        //Post decrement do not decrement the value suddenly it decrements the value after the operation
        System.out.println(count);


    }
    
}
