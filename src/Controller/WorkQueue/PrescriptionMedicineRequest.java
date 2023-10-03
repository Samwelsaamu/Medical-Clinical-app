/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class PrescriptionMedicineRequest extends WorkRequest{
    
    private String requesteResult,medicinename;
    private int quantity;
    private PatientRequest workOrderR;
    private PrescriptionNotesWorker precriptionNotesWList;
    private ArrayList<PatientMedicineRequest> patientMedicines;

    public ArrayList<PatientMedicineRequest> getPatientMedicines() {
        return patientMedicines;
    }

    public void setPatientConditionsW(PatientMedicineRequest patientMedicines) {
        this.patientMedicines.add(patientMedicines);
    }
    
    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }

    public PrescriptionNotesWorker getPrecriptionNotesWList() {
        return precriptionNotesWList;
    }

    public void setPrecriptionNotesWList(PrescriptionNotesWorker precriptionNotesWList) {
        this.precriptionNotesWList = precriptionNotesWList;
    }
    
    
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }
    
    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}