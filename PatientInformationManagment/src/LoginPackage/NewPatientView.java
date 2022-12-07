package LoginPackage;
import javax.swing.*;

import PatientManagment.Patient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewPatientView {
    
    private PatientDetailsController patientDetailsController;
    private JFrame frame = new JFrame("New Patient");
    private JPanel panel1, infoPanel, buttonPanel;
    private JButton saveButton = new JButton("Save");
    private JTextField nameTextField = new JTextField();
    private JTextField symptomsTextField = new JTextField();
    private JTextField heartRateTextField = new JTextField();
    private JTextField dioagnosisTextField = new JTextField();
    private JTextField futureAppointmentTextField = new JTextField();
    private JTextField prescriptionTextField = new JTextField();
    private JTextField statusTextField = new JTextField();
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
    private JTextField addressTextField = new JTextField();
    private JTextField bloodPressureTextField = new JTextField();
    private JLabel symptomsLabel = new JLabel("Symptoms");
    private JLabel heartRateLabel = new JLabel("Heart Rate");
    private JLabel bloodPressureLabel = new JLabel("Blood Pressure");
    private JLabel diagnosisLabel = new JLabel("Diagnosis");
    private JLabel prescriptionLabel = new JLabel("Prescription");
    private JLabel statusLabel = new JLabel("Status");
    private JLabel futureAppointmentLabel = new JLabel("Future Appointment");
    private JLabel IDLabel = new JLabel("ID");
    private JLabel billLabel = new JLabel("Bill");
    private JLabel insuranceLabel = new JLabel("Insurance");
    private JLabel pharmLabel = new JLabel("Pharmacy");
    private JLabel GPLabel = new JLabel("GP");
    private JLabel currentLocationLabel = new JLabel("Current Location");
    private JLabel pastPrescriptionsLabel = new JLabel("Past Prescriptions");
    private JLabel pastDiagnosisLabel = new JLabel("Past Diagnosis");
   
    private JLabel usernameLabel = new JLabel("Enter a Username");
    private JTextField usernamTextField = new JTextField();
    private JLabel passwordLabel = new JLabel("Enter a password");
    private JTextField passworField = new JTextField();
    private JLabel emaiLabel = new JLabel("Enter an email");
    private JTextField emailField = new JTextField();
    private JLabel phoneLabel = new JLabel("Enter a phone number");
    private JTextField phoneField = new JTextField();
    private JLabel nameLabel = new JLabel("Enter name");
    private JTextField nameField = new JTextField();
    private Patient currentPatient;

    public JLabel getUsernameLabel() {
        return this.usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JTextField getUsernamTextField() {
        return this.usernamTextField;
    }

    public void setUsernamTextField(JTextField usernamTextField) {
        this.usernamTextField = usernamTextField;
    }

    public JLabel getPasswordLabel() {
        return this.passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JTextField getPassworField() {
        return this.passworField;
    }

    public void setPassworField(JTextField passworField) {
        this.passworField = passworField;
    }

    public JLabel getEmaiLabel() {
        return this.emaiLabel;
    }

    public void setEmaiLabel(JLabel emaiLabel) {
        this.emaiLabel = emaiLabel;
    }

    public JTextField getEmailField() {
        return this.emailField;
    }

    public void setEmailField(JTextField emaField) {
        this.emailField = emaField;
    }

    public JLabel getPhoneLabel() {
        return this.phoneLabel;
    }

    public void setPhoneLabel(JLabel phoneLabel) {
        this.phoneLabel = phoneLabel;
    }

    public JTextField getPhoneField() {
        return this.phoneField;
    }

    public void setPhoneField(JTextField phonField) {
        this.phoneField = phonField;
    }

    public JLabel getNameLabel() {
        return this.nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JTextField getNameField() {
        return this.nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public Patient getCurrentPatient() {
        return this.currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

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

    public NewPatientView(PatientDetailsController newPatientDetailsController) {
        this.patientDetailsController = newPatientDetailsController;
    }

    public void populatePatientField(int selectedRow, PatientDetailsController patientDetailsController) {
        //nameTextField.setText("" + patientDetailsController
    }


    public void makeVisible() {
        panel1 = new JPanel();

        infoPanel = new JPanel(new GridLayout(5, 2));
        buttonPanel = new JPanel(new GridLayout(1, 1));
        
        
        infoPanel.add(nameLabel);
        infoPanel.add(nameTextField);
        infoPanel.add(usernameLabel);
        infoPanel.add(usernamTextField);
        infoPanel.add(passwordLabel);
        infoPanel.add(passworField);
        infoPanel.add(emaiLabel);
        infoPanel.add(emailField);
        infoPanel.add(phoneLabel);
        infoPanel.add(phoneField);
        buttonPanel.add(saveButton);
        saveButton.addActionListener(new SaveButtonListener());
        frame.setSize(800, 1000);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new JPanel(new BorderLayout()));
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.getContentPane().add(infoPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        panel1.setVisible(true);
        infoPanel.setVisible(true);

    }

    public void close() {
        frame.setVisible(false);
        panel1.setVisible(false);
        infoPanel.setVisible(false);
        buttonPanel.setVisible(false);
    }

    public class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Test save button");
            patientDetailsController.makeNewPatient();    
            patientDetailsController.goBack();
        }
    }
}
