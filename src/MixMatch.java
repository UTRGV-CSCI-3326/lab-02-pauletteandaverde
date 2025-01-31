public class MixMatch {
    // Main method here
    public static void main(String[] args){
        // String
        String varString = "text";
        System.out.println(varString + " <- String, stores a sequence of characters");

        // char
        char varChar = '#';
        System.out.println(varChar + " <- Char, stores a single character");

        // short 
        short varShort = 100;
        System.out.println(varShort + " <- Short, stores values from -32,768 to 32,767");

        // int 
        int varInt = -40000;
        System.out.println(varInt + " <- Integer, stores values from -2,147,483,648 to 2,147,483,647");

        // long 
        long varLong = 1777;
        System.out.println(varLong + " <- Long, stores values from -(2^64) to 2^64-1");

        // float 
        float varFloat = 12.56f;
        System.out.println(varFloat + " <- Float, occupies 32 bits (4 bytes) of memory");

        // double 
        double varDouble = 16.8998;
        System.out.println(varDouble + " <- Double, occupies 64 bits (8 bytes) of memory");

        // boolean
        boolean varBoolean = false;
        System.out.println(varBoolean + " <- Boolean, stores only two values: true or false");
    }
}