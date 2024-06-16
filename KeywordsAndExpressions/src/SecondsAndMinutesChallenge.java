public class SecondsAndMinutesChallenge {

    public static String getDurationString(int secs){
        if (secs <= 0){
            System.out.println("Invalid Input");
        }
        int hr = secs / 3600;
        secs = secs % 3600;
        int min = secs / 60;
        secs = secs % 60;
        return hr + "h " + min + "m " + secs + "secs\n";
    }

    public static String getDurationString(int mins, int secs){
        if (mins <= 0 || (secs <= 0 || secs > 59)){
            return "Invalid Input";
        }
        secs = (mins * 60) + secs;

        int hr = secs / 3600;
        secs = secs % 3600;
        int min = secs / 60;
        secs = secs % 60;
        return hr + "h " + min + "m " + secs + "secs\n";
    }


    public static void main(String[] args) {
        System.out.print(getDurationString(3945));
        System.out.print(getDurationString( 4,600));
    }

}
