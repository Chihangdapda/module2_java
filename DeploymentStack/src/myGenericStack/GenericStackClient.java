package myGenericStack;

import static myGenericStack.MyGenericStack.stackOfIStrings;
import static myGenericStack.MyGenericStack.stackOfIntegers;

public class GenericStackClient {

    public static void main(String[] args) {
        System.out.println("1. Stack of Integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of String");
        stackOfIStrings();
    }


}
