public class TimeConversion {

    /*
     * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
     * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */
    public static String timeConversion(String s) {
        String militaryTime = s.replaceAll("[A-Za-z]", "");
        String hour = s.substring(0, 2);
        String amPm = s.replaceAll("[^A-Za-z]", "");

        if (amPm.equals("AM") && hour.equals("12")) {
            militaryTime = "00" + militaryTime.substring(2);
        } else if (amPm.equals("PM") && !hour.equals("12")) {
            int militaryHour = Integer.parseInt(hour) + 12;
            militaryTime = "" + militaryHour + militaryTime.substring(2);
        }

        return militaryTime;
    }
}
