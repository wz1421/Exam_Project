package Examinations;

import Examinations.Examination;

import java.net.URL;
import java.time.LocalDate;
import java.net.*;

public class MRI extends Examination {
    int field_strength;
    String Scan_date;
    String urlofscan;
    int Month;
    int Year;
    int Date;
    URL url;

    public MRI(int Field_Strength, int year,int month,int date, String url){
        field_strength = Field_Strength;
        Year = year;
        Month = month;
        Date = date;
        urlofscan= url;

    }

    @Override
    public String get_date() {
        LocalDate ld = LocalDate.of(Year,Month,Date);
        String date = ld.toString();
        return date;
    }

    @Override
    public int get_info() {
        return field_strength;
    }
    public String get_URL(){
        return urlofscan;
    }

}
