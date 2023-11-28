package Examinations;

import Examinations.Examination;

import java.time.LocalDate;

public class BP extends Examination {
    int Systolic;
    int Diastolic;
    int Year;
    int Month;
    int Date;
    String Duration;
    public BP(int systolic, int diastolic, int year,int month,int date,String duration){
        Systolic = systolic;
        Diastolic = diastolic;
        Year = year;
        Month = month;
        Date = date;
        Duration = duration;
    }


    @Override
    public String get_date() {
        LocalDate ld = LocalDate.of(Year,Month,Date);
        String date = ld.toString();
        return date;
    }

    @Override
    public int get_info() {
        return Systolic;
    }
    //extra method as Examinations.BP has two measurements but Examinations.MRI only has field Strength
    public int get_info_diastolic(){
        return Diastolic;
    }
    public String getDuration(){
        return Duration;
    }
}
