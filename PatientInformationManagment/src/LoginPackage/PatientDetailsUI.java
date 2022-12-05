package LoginPackage;

import javax.swing.*;

public class PatientDetailsUI extends JFrame{

    private PatientDetailsController patientDetailsController;

    private JPanel panel1;
    private JButton saveButton;
    private JTextField nameTextField;
    private JTextField symptomsTextField;
    private JTextField heartRateTextField;
    private JTextField dioagnosisTextField;
    private JTextField futureAppointmentTextField;
    private JTextField prescriptionTextField;
    private JTextField statusTextField;
    private JTextField roomTextField;
    private JTextField IDTextField;
    private JTextField billTextField;
    private JTextField insuranceTextFieldTextField;
    private JTextField pharmTextFieldTextField;
    private JTextField GPTextField;
    private JTextField currentLocationTextField;
    private JTextField pastPrescriptionsTextField;
    private JTextField pastDiagnosisTextField;
    private JLabel addressLabel;
    private JButton doneButton;
    private JButton deletePatientButton;
    private JLabel nameLabel;
    private JTextField addressTextField;
    private JTextField bloodPressureTextField;
    private JLabel symptomsLabel;
    private JLabel heartRateLabel;
    private JLabel bloodPressureLabel;
    private JLabel diagnosisLabel;
    private JLabel prescriptionLabel;
    private JLabel statusLabel;
    private JLabel futureAppointmentLabel;
    private JLabel roomLabel;
    private JLabel IDLabel;
    private JLabel billLabel;
    private JLabel insuranceLabel;
    private JLabel pharmLabel;
    private JLabel GPLabel;
    private JLabel currentLocationLabel;
    private JLabel pastPrescriptionsLabel;
    private JLabel pastDiagnosisLabel;

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

<<<<<<< Updated upstream
    public PatientDetailsUI(PatientDetailsController newPatientDetailsController){
        setSize(800, 400);
        setLocationRelativeTo(null);
        add(panel1);
        //populatePatientField(selectedRow, patientDetailsController);
    }

    public void populatePatientField(int selectedRow, PatientDetailsController patientDetailsController){
        //nameTextField.setText("" + patientDetailsController
    }

    public void makeVisable() {
        panel1 = new JPanel();

        panel1.setVisible(true);
=======
    public PatientDetailsUI(PatientDetailsController patientDetailsController, int rowNum){
        setSize(800, 400);
        setLocationRelativeTo(null);
        add(panel1);
        patientDetailsController.populatePatientField(patientDetailsController, rowNum);
>>>>>>> Stashed changes
    }


}
