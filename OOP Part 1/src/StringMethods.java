public class StringMethods {
    public static void main(String[] args) {

        printInfo("Hello World");

    }

    public static void printInfo(String string) {
        int length = string.length();
        System.out.printf("Length of String: %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is Empty");
        } else {
            System.out.printf("First char at String: %c %n", string.charAt(0));
            System.out.printf("Last char at String: %c %n", string.charAt(length - 1));
            System.out.printf("First index of r: %d %n", string.indexOf("rld"));
            System.out.printf("First index of l: %d %n", string.lastIndexOf('l'));
        }
    }
}
