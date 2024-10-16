// Must be the same name as the file.
public class Main {
    /* 
    Multiline comments are still possible.
    */
    public static void main(String[] args){
        System.out.println("Hello World");

        final String myString = "Hello World";
        int myInt = 10, mySecondInt = 15;
        float myFloat = 1.0f;
        int myThirdInt = (int) myFloat;
        char myChar = 'A';
        boolean myBool = true;

        String concat = myString + ". My name is Paul!";
        System.out.println(concat);

        myInt = mySecondInt = 20;

        System.out.println("Premult 20: " + (++myInt));

        myInt = 20;

        System.out.println("Postmult 20: " + (myInt++));

        System.out.println("The length of myString is " + myString.length());
        System.out.println("Strings have other methods!" + myString.toUpperCase());
        System.out.println("Strings can NOT be indexed :(");

        System.out.println(Math.max(myInt, mySecondInt));

        if(myBool){
            System.out.println("This is a true block!");
        }
        else if(true){
            System.out.println("How did this happen");
        }

        System.out.println((myBool) ? "Ternary operators are cool" : "Ternary operators are not cool.");

        switch(myInt){
            case 10:
                System.out.println("myInt is 10!");
                break;
            case 20:
                System.out.println("myInt is 20!");
                break;
            case 21:
                System.out.println("myInt is 21!");
            case -10000:
                System.out.println("This shouldn't be possible, but we have fallthrough.");
                break;
            default:
                System.out.println("myInt is none of the above.");
        }

    }

}