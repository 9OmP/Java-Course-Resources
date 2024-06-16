public class SwitchChallenge {

    public static void main(String[] args) {
        char charValue = 'F';

        switch(charValue){
            case 'A':
                System.out.println("Abel");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the Switch.");
                break;

        }
    }
}
