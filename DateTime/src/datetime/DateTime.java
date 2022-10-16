package datetime;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {

    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
//        Date d = new Date();
//        System.out.println(d.getTime());
//        System.out.println(d.getDate());
//        System.out.println(d.getDay());
//        System.out.println(d.getHours());
//        System.out.println(d.getMonth());
//        System.out.println(d.getSeconds());
//        System.out.println(d.getMinutes());
//        System.out.println(d.getYear()+1900); 
          GregorianCalendar gc = new GregorianCalendar();
          System.out.println(gc.isLeapYear(2023));
          System.out.println(gc.getFirstDayOfWeek());
          System.out.println(gc.getTimeZone());
        
    }
    
}
