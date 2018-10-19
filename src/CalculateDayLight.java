import java.time.LocalDate;


public class CalculateDayLight {
    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1800;

    public void DayLight(String date){
        String[] split = date.split("-");//Get the day, month and year from the input
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        boolean daylight = false;//Used to decide whether daylight savings need to be applied
        if(isValidDate(day,month,year)) {
            if (year >= 2007) {
                if (month == 3) {//For the month of March calculate second sunday
                    int secondSunday = marchCalculate(month, year, day);
                    if (day >= secondSunday) {
                        daylight = true;
                    }
                } else if (month == 11) {//For the month of November calculate first sunday
                    int firstSunday = novemberCalculate(month, year, day);
                    if (day <= firstSunday) {
                        daylight = true;
                    }
                } else if (month > 3 && month < 11) {
                    daylight = true;
                }
                if(daylight){
                    System.out.println(year+"-"+month+"-"+day+" 07:00 UTC");
                }
                else{
                    System.out.println(year+"-"+month+"-"+day+" 08:00 UTC");
                }
            }
            else{
                System.out.println("Please provide dates from 2007 onwards");
            }
        }
        else {
            System.out.println("invalid date");
        }
    }

    private boolean isValidDate(int d, int m, int y)
    {
        // If year, month and day
        // are not in given range
        if (y > MAX_VALID_YR ||
                y < MIN_VALID_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        // Handle February month
        // with leap year
        if (m == 2)
        {
            if (isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }

        // Months of April, June,
        // Sept and Nov must have
        // number of days less than
        // or equal to 30.
        if (m == 4 || m == 6 || m == 9 || m == 11)
            return (d <= 30);

        return true;
    }
    private boolean isLeap(int year)
    {
        // Return true if year is
        // a multiple of 4 and not
        // multiple of 100.
        // OR year is multiple of 400.
        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }

    private int marchCalculate(int month, int year, int date){

        LocalDate localDate = LocalDate.of(year, month, 01);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String weekDay = dayOfWeek.toString();
        int secondSunday = -1;
        switch (weekDay){
            case "MONDAY":secondSunday = 14;
            break;//mon
            case "TUESDAY": secondSunday = 13;//tue
            break;
            case "WEDNESDAY": secondSunday=12;//wed
            break;
            case "THURSDAY": secondSunday=11;//thu
            break;
            case "FRIDAY": secondSunday=10;//fri
            break;
            case "SATURDAY": secondSunday=9;//sat
            break;
            case "SUNDAY": secondSunday=8;//sun
                break;
        }
        return secondSunday;
    }
    private int novemberCalculate(int month, int year, int date)
    {
        LocalDate localDate = LocalDate.of(year, month, 01);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String weekDay = dayOfWeek.toString();
        int firstSunday = -1;
        switch (weekDay){
            case "MONDAY":firstSunday = 7;
                break;//mon
            case "TUESDAY": firstSunday = 6;//tue
                break;
            case "WEDNESDAY": firstSunday=5;//wed
                break;
            case "THURSDAY": firstSunday=4;//thu
                break;
            case "FRIDAY": firstSunday=3;//fri
                break;
            case "SATURDAY": firstSunday=2;//sat
                break;
            case "SUNDAY": firstSunday=1;//sun
                break;
        }
        return firstSunday;
    }
}
