import Examinations.BP;
import Examinations.MRI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class DoctorDisplay {
    static JFrame frame = new JFrame();
    static Patient patient1 =new Patient("Daphne Von Oram","https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",62);
    static Patient patient2 =new Patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg",31);
    public static void main(String[] args) {
        //info for Patient1
        JLabel patient1name = new JLabel("Patient name is:" +patient1.getFullName());
        JLabel patient1age = new JLabel("Age:"+patient1.get_age());
        MRI mripatient1 = new MRI(2,2023,9,14,"https://martinh.netfirms.com/BIOE60010/mri1.jpg");
        BP bppatient1 = new BP(130,70,2023,9,15,"ST");

        //info for Patient2
        JLabel patient2name = new JLabel("Patient name is:" +patient2.getFullName());
        JLabel patient2age = new JLabel("Age:"+patient2.get_age());
        MRI mripatient2 = new MRI(4,2023,11,19,"https://martinh.netfirms.com/BIOE60010/mri2.jpg");
        BP bppatient2 = new BP(150,80,2023,11,20,"VST");


        JLabel patient1resultsy = new JLabel("Blood Pressure: Systolic: "+bppatient1.get_info()+"mmHg");
        JLabel patient1resultdy= new JLabel(" Diastolic: "+bppatient1.get_info_diastolic()+"mmHg");
        JPanel panel = new JPanel();


        //System output to the adminstrator patient 1
        System.out.println("Patient: "+patient1.getFullName()+" MRI: "+mripatient1.get_info()+" Tesla "+mripatient1.get_date()+
                " BP: "+bppatient1.getDuration()+","+bppatient1.get_date());

        //Patient 2 information Output
        JLabel patient2resultsy = new JLabel("Blood Pressure: Systolic: "+bppatient2.get_info()+"mmHg");
        JLabel patient2resultdy = new JLabel("Diastolic: "+bppatient2.get_info_diastolic()+"mmHg");
        panel.setVisible(true);
        //System output to the adminstrator for patient 2
        System.out.println("Patient: "+patient2.getFullName()+" MRI: "+mripatient2.get_info()+" Tesla "+mripatient2.get_date()+
                " BP: "+bppatient2.getDuration()+","+bppatient2.get_date());



        //adding Images from the URL
        Image image = null;
        Image image2 = null;
        Image image3 = null;
        Image image4 = null;
        try {
            //mri image URL

            URL url = new URL(mripatient1.get_URL());
            URL url2 = new URL(patient1.get_URL());
            URL url3 = new URL(mripatient2.get_URL());
            URL url4 = new URL(patient2.get_URL());
            image = ImageIO.read(url);
            image2 = ImageIO.read(url2);
            image3 = ImageIO.read(url3);
            image4 = ImageIO.read(url4);

        } catch (Exception exp) {
            exp.printStackTrace();
        }
        JLabel MRIpatient1 = new JLabel(new ImageIcon(image));
        JLabel Patient1Photo = new JLabel(new ImageIcon(image2));
        JLabel MRIpatient2 = new JLabel(new ImageIcon(image3));
        JLabel Patient2Photo = new JLabel(new ImageIcon(image4));

        panel.add(Patient1Photo);
        //making a panel just for name and age for patient 1 for the grid layout
        JPanel patient1nameandagepanel = new JPanel();
        patient1nameandagepanel.add(patient1name);
        patient1nameandagepanel.add(patient1age);
        patient1nameandagepanel.setLayout(new GridLayout(2,1));
        panel.add(patient1nameandagepanel);
        patient1nameandagepanel.setVisible(true);

        //making a panel for the measurements of patient 1
        JPanel patient1measurements = new JPanel();
        patient1measurements.add(patient1resultsy);
        patient1measurements.add(patient1resultdy);
        patient1measurements.setLayout(new GridLayout(2,1));
        panel.add(MRIpatient1);
        panel.add(patient1measurements);

        //making a panel just for name and age of patient2
        JPanel patient2nameandagepanel = new JPanel();
        patient2nameandagepanel.add(patient2name);
        patient2nameandagepanel.add(patient2age);
        patient2nameandagepanel.setLayout(new GridLayout(2,1));
        panel.add(Patient2Photo);
        panel.add(patient2nameandagepanel);
        patient2nameandagepanel.setVisible(true);

        //making a panel for measurement of patient 2
        JPanel patient2measurements = new JPanel();
        patient2measurements.add(patient2resultsy);
        patient2measurements.add(patient2resultdy);
        patient2measurements.setLayout(new GridLayout(2,1));
        panel.add(MRIpatient2);
        panel.add(patient2measurements);

        panel.setLayout(new GridLayout(2,4));

        //adding panel to the Jframe
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }



}
