package LoginPackage;

import javax.swing.table.AbstractTableModel;

import PatientManagment.Patient;

public class PatientInfoTable extends AbstractTableModel{
    private Patient currentPatient;

    public PatientInfoTable(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return (Object) currentPatient.getBloodPressure();
            case 1: return (Object) currentPatient.getHeartRate();
            case 2: return (Object) currentPatient.getSymptoms();
            case 3: return (Object) currentPatient.getDiagnosis();

            default: return null;
        }
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
