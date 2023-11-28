import java.net.URL;
import java.time.LocalDate;

public class MRI extends Examination{
    int field_strength;
    String Scan_date;
    URL urlofscan;
    int Month;
    int Year;
    int Date;

    public MRI(int Field_Strength, int year,int month,int date, URL url){
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
}
