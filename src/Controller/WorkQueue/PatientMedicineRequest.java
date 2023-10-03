/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.WorkQueue;

import Controller.Medicine.Medicine;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class PatientMedicineRequest extends WorkRequest{
    
    private String requesteResult,uploaded;

    private int quantity;
    private Medicine medicinename;
    private PatientRequest workOrderR;
    private PrescriptionNotesWorker precriptionNotesWList;

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
    
    public Medicine getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(Medicine medicinename) {
        this.medicinename = medicinename;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }
}