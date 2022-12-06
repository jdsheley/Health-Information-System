package LoginPackage;

import javax.swing.*;

import PatientManagment.Patient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDetailsUI extends JFrame {

    private PatientDetailsController patientDetailsController;

    private JPanel panel1, infoPanel, buttonPanel;
    private JButton saveButton = new JButton("Save");
    private JTextField nameTextField = new JTextField();
    private JTextField symptomsTextField = new JTextField();
    private JTextField heartRateTextField = new JTextField();
    private JTextField dioagnosisTextField = new JTextField();
    private JTextField futureAppointmentTextField = new JTextField();
    private JTextField prescriptionTextField = new JTextField();
    private JTextField statusTextField = new JTextField();
    private JTextField roomTextField = new JTextField();
    private JTextField IDTextField = new JTextField();
    private JTextField billTextField = new JTextField();
    private JTextField insuranceTextFieldTextField = new JTextField();
    private JTextField pharmTextFieldTextField = new JTextField();
    private JTextField GPTextField = new JTextField();
    private JTextField currentLocationTextField = new JTextField();
    private JTextField pastPrescriptionsTextField = new JTextField();
    private JTextField pastDiagnosisTextField = new JTextField();
    private JLabel addressLabel = new JLabel("Address");
    private JButton doneButton = new JButton("Done");
    private JButton deletePatientButton = new JButton("Delete");
    private JLabel nameLabel = new JLabel("Name");
    private JTextField addressTextField = new JTextField();
    private JTextField bloodPressureTextField = new JTextField();
    private JLabel symptomsLabel = new JLabel("Symptoms");
    private JLabel heartRateLabel = new JLabel("Heart Rate");
    private JLabel bloodPressureLabel = new JLabel("Blood Pressure");
    private JLabel diagnosisLabel = new JLabel("Diagnosis");
    private JLabel prescriptionLabel = new JLabel("Prescription");
    private JLabel statusLabel = new JLabel("Status");
    private JLabel futureAppointmentLabel = new JLabel("Future Appointment");
    private JLabel roomLabel = new JLabel("Room");
    private JLabel IDLabel = new JLabel("ID");
    private JLabel billLabel = new JLabel("Bill");
    private JLabel insuranceLabel = new JLabel("Insurance");
    private JLabel pharmLabel = new JLabel("Pharmacy");
    private JLabel GPLabel = new JLabel("GP");
    private JLabel currentLocationLabel = new JLabel("Current Location");
    private JLabel pastPrescriptionsLabel = new JLabel("Past Prescriptions");
    private JLabel pastDiagnosisLabel = new JLabel("Past Diagnosis");
    private Patient currentPatient;

    private JScrollPane scroller;

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getSymptomsTextField() {
        return symptomsTextField;
    }

    public void setSymptomsTextField(JTextField symptomsTextField) {
        this.symptomsTextField = symptomsTextField;
    }

    public JTextField getHeartRateTextField() {
        return heartRateTextField;
    }

    public void setHeartRateTextField(JTextField heartRateTextField) {
        this.heartRateTextField = heartRateTextField;
    }

    public JTextField getDioagnosisTextField() {
        return dioagnosisTextField;
    }

    public void setDioagnosisTextField(JTextField dioagnosisTextField) {
        this.dioagnosisTextField = dioagnosisTextField;
    }

    public JTextField getFutureAppointmentTextField() {
        return futureAppointmentTextField;
    }

    public void setFutureAppointmentTextField(JTextField futureAppointmentTextField) {
        this.futureAppointmentTextField = futureAppointmentTextField;
    }

    public JTextField getPrescriptionTextField() {
        return prescriptionTextField;
    }

    public void setPrescriptionTextField(JTextField prescriptionTextField) {
        this.prescriptionTextField = prescriptionTextField;
    }

    public JTextField getStatusTextField() {
        return statusTextField;
    }

    public void setStatusTextField(JTextField statusTextField) {
        this.statusTextField = statusTextField;
    }

    public JTextField getRoomTextField() {
        return roomTextField;
    }

    public void setRoomTextField(JTextField roomTextField) {
        this.roomTextField = roomTextField;
    }

    public JTextField getIDTextField() {
        return IDTextField;
    }

    public void setIDTextField(JTextField IDTextField) {
        this.IDTextField = IDTextField;
    }

    public JTextField getBillTextField() {
        return billTextField;
    }

    public void setBillTextField(JTextField billTextField) {
        this.billTextField = billTextField;
    }

    public JTextField getInsuranceTextFieldTextField() {
        return insuranceTextFieldTextField;
    }

    public void setInsuranceTextFieldTextField(JTextField insuranceTextFieldTextField) {
        this.insuranceTextFieldTextField = insuranceTextFieldTextField;
    }

    public JTextField getPharmTextFieldTextField() {
        return pharmTextFieldTextField;
    }

    public void setPharmTextFieldTextField(JTextField pharmTextFieldTextField) {
        this.pharmTextFieldTextField = pharmTextFieldTextField;
    }

    public JTextField getGPTextField() {
        return GPTextField;
    }

    public void setGPTextField(JTextField GPTextField) {
        this.GPTextField = GPTextField;
    }

    public JTextField getCurrentLocationTextField() {
        return currentLocationTextField;
    }

    public void setCurrentLocationTextField(JTextField currentLocationTextField) {
        this.currentLocationTextField = currentLocationTextField;
    }

    public JTextField getPastPrescriptionsTextField() {
        return pastPrescriptionsTextField;
    }

    public void setPastPrescriptionsTextField(JTextField pastPrescriptionsTextField) {
        this.pastPrescriptionsTextField = pastPrescriptionsTextField;
    }

    public JTextField getPastDiagnosisTextField() {
        return pastDiagnosisTextField;
    }

    public void setPastDiagnosisTextField(JTextField pastDiagnosisTextField) {
        this.pastDiagnosisTextField = pastDiagnosisTextField;
    }

    public JLabel getAddressLabel() {
        return addressLabel;
    }

    public void setAddressLabel(JLabel addressLabel) {
        this.addressLabel = addressLabel;
    }

    public JButton getDoneButton() {
        return doneButton;
    }

    public void setDoneButton(JButton doneButton) {
        this.doneButton = doneButton;
    }

    public JButton getDeletePatientButton() {
        return deletePatientButton;
    }

    public void setDeletePatientButton(JButton deletePatientButton) {
        this.deletePatientButton = deletePatientButton;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JTextField getAddressTextField() {
        return addressTextField;
    }

    public void setAddressTextField(JTextField addressTextField) {
        this.addressTextField = addressTextField;
    }

    public JTextField getBloodPressureTextField() {
        return bloodPressureTextField;
    }

    public void setBloodPressureTextField(JTextField bloodPressureTextField) {
        this.bloodPressureTextField = bloodPressureTextField;
    }

    public JLabel getSymptomsLabel() {
        return symptomsLabel;
    }

    public void setSymptomsLabel(JLabel symptomsLabel) {
        this.symptomsLabel = symptomsLabel;
    }

    public JLabel getHeartRateLabel() {
        return heartRateLabel;
    }

    public void setHeartRateLabel(JLabel heartRateLabel) {
        this.heartRateLabel = heartRateLabel;
    }

    public JLabel getBloodPressureLabel() {
        return bloodPressureLabel;
    }

    public void setBloodPressureLabel(JLabel bloodPressureLabel) {
        this.bloodPressureLabel = bloodPressureLabel;
    }

    public JLabel getDiagnosisLabel() {
        return diagnosisLabel;
    }

    public void setDiagnosisLabel(JLabel diagnosisLabel) {
        this.diagnosisLabel = diagnosisLabel;
    }

    public JLabel getPrescriptionLabel() {
        return prescriptionLabel;
    }

    public void setPrescriptionLabel(JLabel prescriptionLabel) {
        this.prescriptionLabel = prescriptionLabel;
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(JLabel statusLabel) {
        this.statusLabel = statusLabel;
    }

    public JLabel getFutureAppointmentLabel() {
        return futureAppointmentLabel;
    }

    public void setFutureAppointmentLabel(JLabel futureAppointmentLabel) {
        this.futureAppointmentLabel = futureAppointmentLabel;
    }

    public JLabel getRoomLabel() {
        return roomLabel;
    }

    public void setRoomLabel(JLabel roomLabel) {
        this.roomLabel = roomLabel;
    }

    public JLabel getIDLabel() {
        return IDLabel;
    }

    public void setIDLabel(JLabel IDLabel) {
        this.IDLabel = IDLabel;
    }

    public JLabel getBillLabel() {
        return billLabel;
    }

    public void setBillLabel(JLabel billLabel) {
        this.billLabel = billLabel;
    }

    public JLabel getInsuranceLabel() {
        return insuranceLabel;
    }

    public void setInsuranceLabel(JLabel insuranceLabel) {
        this.insuranceLabel = insuranceLabel;
    }

    public JLabel getPharmLabel() {
        return pharmLabel;
    }

    public void setPharmLabel(JLabel pharmLabel) {
        this.pharmLabel = pharmLabel;
    }

    public JLabel getGPLabel() {
        return GPLabel;
    }

    public void setGPLabel(JLabel GPLabel) {
        this.GPLabel = GPLabel;
    }

    public JLabel getCurrentLocationLabel() {
        return currentLocationLabel;
    }

    public void setCurrentLocationLabel(JLabel currentLocationLabel) {
        this.currentLocationLabel = currentLocationLabel;
    }

    public JLabel getPastPrescriptionsLabel() {
        return pastPrescriptionsLabel;
    }

    public void setPastPrescriptionsLabel(JLabel pastPrescriptionsLabel) {
        this.pastPrescriptionsLabel = pastPrescriptionsLabel;
    }

    public JLabel getPastDiagnosisLabel() {
        return pastDiagnosisLabel;
    }

    public void setPastDiagnosisLabel(JLabel pastDiagnosisLabel) {
        this.pastDiagnosisLabel = pastDiagnosisLabel;
    }

    public PatientDetailsUI(PatientDetailsController newPatientDetailsController) {

    }

    public void populatePatientField(int selectedRow, PatientDetailsController patientDetailsController) {
        //nameTextField.setText("" + patientDetailsController
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    public void makeVisible() {
        panel1 = new JPanel();

        infoPanel = new JPanel(new GridLayout(5, 2));
        buttonPanel = new JPanel(new GridLayout(1, 4));
        
        
        infoPanel.add(nameLabel);
        nameTextField.setText(currentPatient.getName());
        infoPanel.add(nameTextField);
        infoPanel.add(roomLabel);
        roomTextField.setText("100");
        infoPanel.add(roomTextField);
        infoPanel.add(addressLabel);
        addressTextField.setText("100 Hospital Way");
        infoPanel.add(addressTextField);
        infoPanel.add(IDLabel);
        IDTextField.setText(Integer.toString(currentPatient.getId()));
        infoPanel.add(IDTextField);
        infoPanel.add(symptomsLabel);
        symptomsTextField.setText(currentPatient.getSymptoms());
        infoPanel.add(symptomsTextField);
        infoPanel.add(billLabel);
        billTextField.setText(Double.toString(currentPatient.getBill()));
        infoPanel.add(billTextField);
        infoPanel.add(heartRateLabel);
        heartRateTextField.setText(currentPatient.getHeartRate());
        infoPanel.add(heartRateTextField);
        // infoPanel.add(insuranceLabel);
        // infoPanel.add(insuranceTextFieldTextField); //Remove
        infoPanel.add(bloodPressureLabel);
        bloodPressureTextField.setText(currentPatient.getBloodPressure());
        infoPanel.add(bloodPressureTextField);
        // infoPanel.add(pharmLabel);
        // infoPanel.add(pharmTextFieldTextField); //Remove
        infoPanel.add(diagnosisLabel);
        dioagnosisTextField.setText(currentPatient.getDiagnosis());
        infoPanel.add(dioagnosisTextField);
        // infoPanel.add(GPLabel);
        // infoPanel.add(GPTextField); //Remove
        infoPanel.add(prescriptionLabel);
        prescriptionTextField.setText(currentPatient.getPerscription());
        infoPanel.add(prescriptionTextField);
        // infoPanel.add(currentLocationLabel);
        // infoPanel.add(currentLocationTextField); //Remove
        // infoPanel.add(statusLabel);
        // infoPanel.add(statusTextField); //Remove
        // infoPanel.add(pastPrescriptionsLabel);
        // infoPanel.add(pastPrescriptionsTextField);
        // infoPanel.add(futureAppointmentLabel);
        // infoPanel.add(futureAppointmentTextField); //Remove 
        // infoPanel.add(pastDiagnosisLabel);
        // infoPanel.add(pastDiagnosisTextField);
        buttonPanel.add(saveButton);
        buttonPanel.add(deletePatientButton);
        buttonPanel.add(doneButton);
        //scroller = new JScrollPane(panel1);
        //scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //scroller.setPreferredSize(new Dimension(500, 400));
        //panel1.add(scroller);
        this.setSize(800, 1000);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(infoPanel, BorderLayout.CENTER);
        this.setVisible(true);

        panel1.setVisible(true);
        infoPanel.setVisible(true);


//    public PatientDetailsUI(PatientDetailsController patientDetailsController, int rowNum){
//        setSize(800, 400);
//        setLocationRelativeTo(null);
//        add(panel1);
//        patientDetailsController.populatePatientField(patientDetailsController, rowNum);
//    }



    }

    public class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class DoneButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}