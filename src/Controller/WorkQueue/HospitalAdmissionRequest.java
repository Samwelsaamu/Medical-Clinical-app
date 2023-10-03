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
public class HospitalAdmissionRequest extends WorkRequest{
    //ccm routes suicide ideation to emergency vehicle driver and picks patient and takes to hospital
    private String requesteResult;
    private PatientRequest workOrderR;
    private SuicideIdeationRequest suidiceIdeation;
    private BillGeneratorWorker billGWList;
    private DischargePatientRequest dischargePatientRList;
    private ArrayList<ClinicalCounsellingWorker> clinicalCWList;
    private ArrayList<PatientConditionsWorker> patientConditionsWList;
    
    public HospitalAdmissionRequest() {
        patientConditionsWList = new ArrayList<>();
        clinicalCWList = new ArrayList<>();
    }

    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }
    
    
    public ArrayList<PatientConditionsWorker> getPatientConditionsW() {
        return patientConditionsWList;
    }

    public void setPatientConditionsW(PatientConditionsWorker patientConditionsW) {
        this.patientConditionsWList.add(patientConditionsW);
    }


    public ArrayList<ClinicalCounsellingWorker> getClinicalCW() {
        return clinicalCWList;
    }

    public void setClinicalCW(ClinicalCounsellingWorker clinicalCW) {
        this.clinicalCWList.add(clinicalCW);
    }

    public BillGeneratorWorker getBillGWList() {
        return billGWList;
    }

    public void setBillGWList(BillGeneratorWorker billGWList) {
        this.billGWList = billGWList;
    }

    public DischargePatientRequest getDischargePatientRList() {
        return dischargePatientRList;
    }

    public void setDischargePatientRList(DischargePatientRequest dischargePatientRList) {
        this.dischargePatientRList = dischargePatientRList;
    }
    
    
    public String getRequesteResult() {
        return requesteResult;
    }
    
    public SuicideIdeationRequest getSuidiceIdeation() {
        return suidiceIdeation;
    }

    public void setSuidiceIdeation(SuicideIdeationRequest suidiceIdeation) {
        this.suidiceIdeation = suidiceIdeation;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }
}