public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
		int minutesToAdd = Integer.parseInt(args[1]);
		int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4) );
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24; // in int form aka 6, 12 not 06
        int newMinutes = totalMinutes - (totalHours*60); // in int form aka 6, 12 not 06
        String hourString = "";
        String minuteString = "";
        if(newHours < 10){
            hourString = "0" + newHours;
        }else{
            hourString = hourString + newHours;
        }
        if (newMinutes < 10) {
            minuteString = "0" + newMinutes;
        } else{
            minuteString = minuteString + newMinutes;
        }
        String fullTimeString = hourString + ":" + minuteString;
        System.out.println(fullTimeString);
    }
}
