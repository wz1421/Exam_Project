import Examinations.BP;
import Examinations.MRI;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DoctorDisplay {
    static JFrame frame = new JFrame();
    static Patient patient =new Patient("Daphne Von Oram","https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",62);
    static Patient patient2 =new Patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg",31);
    public static void main(String[] args) {
        //info for Patient1
        JLabel patient1name = new JLabel("Patient name is:" +patient.getFullName());
        JLabel patient1age = new JLabel("Age:"+patient.get_age());
        MRI mripatient1 = new MRI(2,2023,9,14,"https://martinh.netfirms.com/BIOE60010/mri1.jpg");
        BP bppatient1 = new BP(130,70,2023,9,15,"ST");

        //info for Patient2
        JLabel patient2name = new JLabel("Patient name is:" +patient2.getFullName());
        JLabel patient2age = new JLabel("Age:"+patient2.get_age());
        MRI mripatient2 = new MRI(4,2023,11,19,"https://martinh.netfirms.com/BIOE60010/mri2.jpg");
        BP bppatient2 = new BP(150,80,2023,11,20,"VST");


        JLabel patient1result = new JLabel("Blood Pressure: Systolic: "+bppatient1.get_info()+"mmHg \n Diastolic: "+bppatient1.get_info_diastolic());
        JPanel panel = new JPanel();
        panel.add(patient1name);
        panel.add(patient1age);
        panel.add(patient1result);

        //System output to the adminstrator
        System.out.println("Patient: "+patient2.getFullName()+" MRI: "+mripatient2.get_info()+" Tesla "+mripatient2.get_date()+
                " BP: "+bppatient2.getDuration()+","+bppatient2.get_date());

        //Patient 2 information Output
        JLabel patient2result = new JLabel("Blood Pressure: Systolic: "+bppatient2.get_info()+"mmHg \n Diastolic: "+bppatient2.get_info_diastolic());
        panel.add(patient2name);
        panel.add(patient2age);
        panel.add(patient2result);
        panel.setVisible(true);
        //System output to the adminstrator for patient 2
        System.out.println("Patient: "+patient.getFullName()+" MRI: "+mripatient1.get_info()+" Tesla "+mripatient1.get_date()+
                " BP: "+bppatient1.getDuration()+","+bppatient1.get_date());


        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);


    }



}
