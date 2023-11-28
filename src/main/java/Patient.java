public class Patient {
    //final as these variables of pateints should not be changed
    private final String fullname;
    private final int ageofpatient;

    private final String fullurl;

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
