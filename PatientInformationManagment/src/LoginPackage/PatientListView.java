package LoginPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientListView {
    private JFormattedTextField patientListFormattedTextField;
    private JList list1;
    private JScrollBar scrollBar1;
    private JButton selectPatientButton;
    private JPanel patientListPanel;

    public PatientListView() {
        selectPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Patient Selected");
            }
        });
    }

    public void showPatientList() {
        JFrame frame = new JFrame("PatientListView");
        frame.setContentPane(new PatientListView().patientListPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

