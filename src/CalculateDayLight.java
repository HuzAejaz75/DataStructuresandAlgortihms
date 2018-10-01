import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by huzaifa.aejaz on 9/29/18.
 */
public class CalculateDayLight {
    public void DayLight(String date){
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        boolean daylight = false;
        if(year >=2007) {
                if(month == 3){
                   int secondSunday = marchCalculate(month, year,day);
                   if(day < secondSunday){
                       daylight = false;
                   }
                   else{
                       daylight = true;
                   }
                }
                else
                if(month==11){
                    int firstSunday = novemberCalculate(month,year,day);
                    if(day < firstSunday){
                        daylight = false;
                    }
                    else{
                        daylight = true;
                    }
                }
                else
                    if(month >3 && month < 11){
                        daylight = true;
                    }
                else{
                        daylight = false;
                    }
        }
        if(daylight){
            System.out.println(year+"-"+month+"-"+day+" 07:00 UTC");
        }
        else{
            System.out.println(year+"-"+month+"-"+day+" 08:00 UTC");
        }
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
