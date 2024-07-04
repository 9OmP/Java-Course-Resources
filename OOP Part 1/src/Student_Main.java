public class Student_Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            Student s = new Student("50500" + i, switch (i) {
                case 1 -> "Om";
                case 2 -> "Sus";
                case 3 -> "Sarthak";
                case 4 -> "Lisa";
                case 5 -> "Siddhant";
                default -> "Default";
            }, "16th Feb 2002", "Java Masterclass");
            System.out.println(s);
        }
    }
}
