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
public class BillGeneratorWorker extends WorkRequest{
    
    private String requesteResult;
    
    private PatientRequest workOrderR;
    private HospitalAdmissionRequest hospAdmissionRList;

    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }

    public HospitalAdmissionRequest getHospAdmissionRList() {
        return hospAdmissionRList;
    }

    public void setHospAdmissionRList(HospitalAdmissionRequest hospAdmissionRList) {
        this.hospAdmissionRList = hospAdmissionRList;
    }
    
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }
}