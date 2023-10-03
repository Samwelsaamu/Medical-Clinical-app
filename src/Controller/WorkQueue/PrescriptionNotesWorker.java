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
public class PrescriptionNotesWorker extends WorkRequest{
    
    private String requesteResult,notes;
    private PatientRequest workOrderR;
    private BillingWorker billingW;

    
    private PrescriptionMedicineRequest prescriptionMedicineRList;
    private ArrayList<PatientMedicineRequest> patientMedicinesR;

    public void setPatientMedicines(PatientMedicineRequest patientMedicines) {
        this.patientMedicinesR.add(patientMedicines);
    }
    
    
    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }

    public PrescriptionMedicineRequest getPrescriptionMedicineRList() {
        return prescriptionMedicineRList;
    }

    public void setPrescriptionMedicineRList(PrescriptionMedicineRequest prescriptionMedicineRList) {
        this.prescriptionMedicineRList = prescriptionMedicineRList;
    }
    
    public PrescriptionNotesWorker() {
        patientMedicinesR = new ArrayList<>();
    }
    
    public ArrayList<PatientMedicineRequest> getPatientMedicinesR() {
        return patientMedicinesR;
    }
    
    public BillingWorker getBillingW() {
        return billingW;
    }

    public void setBillingW(BillingWorker billingW) {
        this.billingW = billingW;
    }
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }
    
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
  
}