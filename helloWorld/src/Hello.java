public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Mack In Tech!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}

/* Public is an access modifier.
Static is a java keyword that we need for java to find our method in
order to run the code we are going to add.
Void is another java keyword used to indicate that the method will not return anything.
The parenthesis in a method declaration are mandatory & can optionally
include one or more parameters which is a way to pass information to a method.
The {} represents a code block which defines a block of code. This is mandatory.
println should now print out the statement "Hello World"
 */
