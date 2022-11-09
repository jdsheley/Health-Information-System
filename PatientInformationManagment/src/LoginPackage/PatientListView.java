package LoginPackage;

import javax.swing.*;

public class PatientListView {
    private JPanel PatientListView;
    private JScrollBar scrollBar1;
    private JList list1;
    private JButton selectPatientButton;

    public void patientListView() {
    }

    public void showPatientList() {
        JFrame frame = new JFrame("PatientListView");
        frame.setContentPane(new PatientListView().PatientListView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
