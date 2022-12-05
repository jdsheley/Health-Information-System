//package LoginPackage;
//
//import javax.swing.table.AbstractTableModel;
//
//import PatientManagment.Patient;
//
//public class PatientInfoTable extends AbstractTableModel{
//    private Patient currentPatient;
//
//    public PatientInfoTable(Patient currentPatient) {
//        this.currentPatient = currentPatient;
//    }
//
//    @Override
//    public int getRowCount() {
//        return patientArrayList.size();
//    }
//
//    @Override
//    public int getColumnCount() {
//        return columnNames.length;
//    }
//
//    @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        switch(columnIndex) {
//            case 0: return (Object) currentPatient.getBloodPressure();
//            case 1: return (Object) currentPatient.getHeartRate();
//            case 2: return (Object) currentPatient.getSymptoms();
//            case 3: return (Object) currentPatient.getDiagnosis();
//
//            default: return null;
//        }
//    }
//
//    @Override
//    public String getColumnName(int col) {
//        return columnNames[col];
//    }
//
//}
