package Examinations;

public abstract class Examination {
    //forcing the subclasses to implement these methods of get date and information for the examinations
    public abstract String get_date();
    public abstract int get_info();
}
