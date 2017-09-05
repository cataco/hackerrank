import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String timeparts[] = s.split(":");
        int hour = Integer.parseInt(timeparts[0]);
        String indicator = timeparts[2].substring(2,4);
        int militaryHour ;
        if(hour==12 && indicator.equals("AM")){
            militaryHour = 0;
        }else if((hour ==12 && indicator.equals("PM")) || (hour <12 && indicator.equals("AM"))){
            militaryHour = hour;
        }else{
            militaryHour = hour + 12;
        }
        String militaryHourString = militaryHour<10  ? "0"+militaryHour+":" : militaryHour+":";
        return (militaryHourString+timeparts[1]+":"+timeparts[2].substring(0,2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
