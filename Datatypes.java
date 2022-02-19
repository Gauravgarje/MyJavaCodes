public class Datatypes {
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;

    static float myFloat;
    static double myDouble;
    
    static char myChar;
    static String myString;
    public static void main(String[] args) {
        
        System.out.println("DEFAULT VALUES");
        System.out.println("Byte = " + myByte);
        System.out.println("Short = " + myShort);
        System.out.println("Int = " + myInt);
        System.out.println("Long = " + myLong);
        System.out.println("Float = " + myFloat);
        System.out.println("Double = " + myDouble);
        System.out.println("Char = " + myChar);
        System.out.println("String = " + myString);
        
        myByte = 3;
        myShort = 35;
        myInt = 35;
        myLong = 25;
        
        myFloat = 25f;
        myDouble = 32.0;
        
        myChar = 'c';
        myString = "this is a string";
        
        
        System.out.println("MODIFIED VALUES");
        System.out.println("Byte = " + myByte);
        System.out.println("Short = " + myShort);
        System.out.println("Int = " + myInt);
        System.out.println("Long = " + myLong);
        System.out.println("Float = " + myFloat);
        System.out.println("Double = " + myDouble);
        System.out.println("Char = " + myChar);
        System.out.println("String = " + myString);
        
    }
}

// OUTPUTS:

// DEFAULT VALUES
// Byte = 0
// Short = 0
// Int = 0
// Long = 0
// Float = 0.0
// Double = 0.0
// Char =
// String = null
// MODIFIED VALUES
// Byte = 3
// Short = 35
// Int = 35
// Long = 25
// Float = 25.0
// Double = 32.0
// Char = c
// String = this is a string