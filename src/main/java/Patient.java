import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Patient {
    //final as these variables of pateints should not be changed
    private final String fullname;
    private final int ageofpatient;

    private final String fullurl;

    private URL url;

    public Patient(String name, String url, int age ){
        fullname = name;
        fullurl = url;
        ageofpatient = age;
    }
    public String getFullName() {
        return fullname;
    }
    public int get_age(){
        return ageofpatient;
    }
    public String get_URL() {
        return fullurl;

    }


}
