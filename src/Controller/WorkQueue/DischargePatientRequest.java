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
public class DischargePatientRequest extends WorkRequest{
    
    private String requesteResult;
    
    private PatientRequest workOrderR;
    private BillGeneratorWorker billGWList;
    private HospitalAdmissionRequest hospAdmissionRList;
    
    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }

    public BillGeneratorWorker getBillGWList() {
        return billGWList;
    }

    public void setBillGWList(BillGeneratorWorker billGWList) {
        this.billGWList = billGWList;
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