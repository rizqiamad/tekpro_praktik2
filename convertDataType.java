public class convertDataType {
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        float f = (long) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
