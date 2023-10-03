/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.WorkQueue;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class BillingWorker extends WorkRequest{
    
    private String requesteResult;
    
    private PatientRequest workOrderR;
    private PrescriptionNotesWorker precriptionNotesW;
    
    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }

   public PrescriptionNotesWorker getPrecriptionNotesW() {
        return precriptionNotesW;
    }

    public void setPrecriptionNotesW(PrescriptionNotesWorker precriptionNotesW) {
        this.precriptionNotesW = precriptionNotesW;
    }
    
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }
}