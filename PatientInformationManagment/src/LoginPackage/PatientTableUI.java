package LoginPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import PatientManagment.*;
import java.util.ArrayList;


public class PatientTableUI extends JFrame {
    private JPanel tablePanel, buttonPanel;
    private JTable patientTable;
    private JButton exitButton, selectButton, newPatientButton;
    private PatientTableController patientTableCntl;
    private JScrollPane tableScroller;
    private ArrayList<Patient> patientList;


    public PatientTableUI(PatientTableController patientTableCntl, ArrayList<Patient> patientList) {
        this.patientTableCntl = patientTableCntl;
        this.patientList = patientList;
        //initialTableComponents();

    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }


    public void initialTableComponents() {

        this.setTitle("Patient List");

        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 4));
        patientTable = new JTable(patientTableCntl.getThePatientTableModel());
        patientTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        patientTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        exitButton = new JButton("Exit");
        selectButton = new JButton("Select");
        newPatientButton = new JButton("New");
        buttonPanel.add(exitButton);
        buttonPanel.add(selectButton);
        buttonPanel.add(newPatientButton);
        tablePanel.add(patientTable);
        tableScroller = new JScrollPane(patientTable);
        patientTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(700,300));
        tablePanel.add(tableScroller);
        exitButton.addActionListener(new ExitButtonListener());
        selectButton.addActionListener(new SelectButtonListener());
        newPatientButton.addActionListener(new NewPatientButtonListener());
        this.setSize(800, 400);
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
            int column = 0;
            int row = patientTable.getSelectedRow();
            String name = patientTable.getModel().getValueAt(row, column).toString();
            System.out.println(name);
            patientTableCntl.getSelectedPatient(name, patientList);
        }
    }

    public class NewPatientButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            patientTableCntl.showNewPatientUI();
            // patientTableCntl.addPatient();
            // initialTableComponents();
        }
        
    }

    


}
