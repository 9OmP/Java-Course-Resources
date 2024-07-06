public class Student_Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("50500" + i, switch (i) {
                case 1 -> "Om";
                case 2 -> "Sus";
                case 3 -> "Sarthak";
                case 4 -> "Lisa";
                case 5 -> "Siddhant";
                default -> "Default";
            }, "16th Feb 2002", "Java Masterclass");
            System.out.println(s);
        };

        Student pojo_student = new Student("50506", "Bill", "1st Jan 2002", "Java Oracle Prep");
        System.out.println(pojo_student);
        LPAStudent lpa_student = new LPAStudent("50507", "Ann", "2nd Jan 2002", "Java Oracle Prep");
        System.out.println(lpa_student);
        System.out.println(pojo_student.getName() + " has id " + pojo_student.getId() + ".");
        System.out.println(lpa_student.name() + " has id " + lpa_student.id() + ".");

    }
}