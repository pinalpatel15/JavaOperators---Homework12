package HomeWork12;

public class DataTypes {

    public static void main(String[] args) {
            //Primitive data types
        /*
        Byte:
        Range: -128 to 127
        Memory: 1byte = 8 bits
         */

            byte b = 25; //define
            System.out.println(b);

        /*
        Short:
        Range: -32768 to 32767
        Memory: 2 bytes = 16 bits
        */

/*
String: Default class available in Java.
- Any text any length
 */

            String s1 = "Unify";
            String s2 = "Hello Java";
            String s3 = "1000";
            String s4 = "1 Melton Road";

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);


            short s = 32700;
            System.out.println(s);

        /*
        Integer:
        Range: quite high
       Memory: 4 bytes = 32 bits
         */

            int i = 1000000000;
            System.out.println(i);

        /*
        Long:
        Range: really high
        Memory: 8 bytes = 64 bits
         */
            long l = 1000000000000L;
            System.out.println(l);

            //Decimal Numbers
        /*
        Float:
        Memory: 4 bytes = 32 bits
        Range: - quite high less than double
         */

            float f = 12.34f;
            float f1 = (float) 12.22;
            System.out.println(f);

        /*
        Double:
        Memory: 8 bytes = 64bits
        Range - up tp 15 decimal places roughly
         */

            double d = 12.44;
            System.out.println(d);

        /*
        Character (single values - unicode values)
        Memory: 2 bytes = 16 bits
         */

            char c1 = 'A';
            char c2 = 'B';
            char c3 = 'c';

            System.out.println(c1);
        /*
        Boolean:
        memory: less than 1bit
        range: true or false
         */

            boolean b1 = true;
            boolean b2 = false;
            System.out.println(b1);

        }
    }
