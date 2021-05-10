package datatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * these set of statements will list all the data types their size in bits, bytes and their range.
         *
         * instead of using Byte.size / 8 we can use Byte.BYTES in order to obtain size in bytes.
         */
        System.out.printf("%12s\t%12s\t%12s\t%12s\n", "Data Types", "Size in Bits", "Size in Bytes", "Range");
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Byte: ", Byte.SIZE, Byte.SIZE / 8, "from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Short: ", Short.SIZE, Short.SIZE / 8, "from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Char: ", Character.SIZE, Character.SIZE / 8, "from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Int: ", Integer.SIZE, Integer.SIZE / 8, "from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Long: ", Long.SIZE, Long.SIZE / 8, "from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Float: ", Float.SIZE, Float.SIZE / 8, "from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.printf("%-14s\t%-14d\t%-14d\t%s\n", "Double: ", Double.SIZE, Double.SIZE / 8, "from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.printf("%-14s\t%-14s\t%-14s\t%s\n", "Boolean: ", "not specified", "not specified", "has " + Boolean.TRUE + " and " + Boolean.FALSE);

    }
}