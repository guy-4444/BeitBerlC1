package worldGame;

public class MyString {

    public static String format(long n) {
        if (n < 1_000) {
            return "" + n;
        } else if (n < 1_000_000) {
            return (n / 1_000.0) + "k";
        } else if (n < 1_000_000_000) {
            return (n / 1_000_000.0) + "m";
        } else if (n < 1_000_000_000_000L) {
            return (n / 1_000_000_000.0) + "b";
        }

        return "" + n;
    }
}
