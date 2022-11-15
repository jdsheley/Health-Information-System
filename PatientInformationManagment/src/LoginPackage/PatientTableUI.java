package LoginPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientTableUI extends JFrame {
    private JPanel tablePanel, buttonPanel;
    private JTable patientTable;
    private JButton exitButton, selectButton, newPatientButton;
    private PatientTableController patientTableCntl;

    public PatientTableUI(PatientTableController patientTableCntl) {
        this.patientTableCntl = patientTableCntl;
    }

    public void initialTableComponents() {
        this.setTitle("Patient List");

        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 4));
        patientTable = new JTable(patientTableCntl.getThePatientTableModel());
        patientTable.getColumnModel().getColumn(0).setPreferredWidth(35);
        exitButton = new JButton("Exit");
        selectButton = new JButton("Select");
        newPatientButton = new JButton("New");
        buttonPanel.add(exitButton);
        buttonPanel.add(selectButton);
        buttonPanel.add(newPatientButton);
        exitButton.addActionListener(new ExitButtonListener());
        selectButton.addActionListener(new SelectButtonListener());
        newPatientButton.addActionListener(new NewPatientButtonListener());
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void showTable() {
        initialTableComponents();
    }

    public class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public class SelectButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class NewPatientButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


}
