package LoginPackage;
import PatientInformationPackage.*;
import PatientManagment.*;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PatientTableModel extends AbstractTableModel {
    private String[] columnNames = {"Patient Name", "Email", "Phone Number"};
    private ArrayList<Patient> patientArrayList;
    public PatientTableModel(ArrayList<Patient> newPatientArrayList) {
        patientArrayList = newPatientArrayList;
    }

    @Override
    public int getRowCount() {
        return patientArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return (Object) patientArrayList.get(rowIndex).getName();
            case 1: return (Object) patientArrayList.get(rowIndex).getEmail();
            case 2: return (Object) patientArrayList.get(rowIndex).getPhoneNum();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

}
