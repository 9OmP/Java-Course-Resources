public class String_Manipulation_Methods {

    public static void main(String[] args) {

        String birthDate = "16/02/2002";
        int startingIndex = birthDate.indexOf("2002");
        System.out.println("starting index: " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3, 5));
        String newDate = String.join("/", birthDate.substring(0,2), birthDate.substring(3, 5),birthDate.substring(startingIndex));
        System.out.println(newDate);
    }

}
