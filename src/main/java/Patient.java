import java.net.URL;

public class Patient {
    //final as these variables of pateints should not be changed
    private final String fullname;
    private final int ageofpatient;

    private final URL fullurl;

    public Patient(String name, URL url, int age ){
        fullname = name;
        fullurl = url;
        ageofpatient = age;
    }
    public String getFullName() {
        return fullname;
    }
    public int age(){
        return ageofpatient;
    }
    public URL getURL(){
        return fullurl;
    }


}
