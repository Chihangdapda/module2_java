package nextDayCalculator;

public class NextDayCalculator {
    public static final int firstDayOfMouth = 1;

    public static String nextDayCalculator(int day, int mouth, int year) {
        int nextDay = day;
        int nextMouth = mouth;
        int nextYear = year;

        if (day == getLastOfMonth(mouth, year)) {
            if (mouth == 12) {
                nextDay = firstDayOfMouth;
                nextMouth = 1;
                nextYear++;
            } else {
                nextDay = firstDayOfMouth;
                nextMouth++;
            }

        } else nextDay++;


        return nextDay + "/" + nextMouth + "/" + nextYear;
    }

    private static int getLastOfMonth(int mouth, int year) {
        switch (mouth) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;

        }
        return 31;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }
}




