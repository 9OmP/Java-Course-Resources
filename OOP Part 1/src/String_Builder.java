public class String_Builder {

    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyString = new StringBuilder();
        StringBuilder emptyString32 = new StringBuilder(32);
        emptyString.append("a".repeat(17));
        emptyString32.append("a".repeat(17));

        printInformation(emptyString);
        printInformation(emptyString32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16, "g");
        System.out.println(builderPlus);
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
