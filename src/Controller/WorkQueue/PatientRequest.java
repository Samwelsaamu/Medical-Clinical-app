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
public class PatientRequest extends WorkRequest{
    private String requesteResult;
    private SuicideIdeationRequest suidiceIdeation;
    private PrescriptionNotesWorker precriptionNotesWList;
    private PrescriptionMedicineRequest prescriptionMedicineRList;
    private HospitalAdmissionRequest hospAdmissionRequest;
    private DischargePatientRequest dischargePatient;
    private BillGeneratorWorker billGWList;
    private BillingWorker billingW;
    private ArrayList<PatientConditionsWorker> patientConditionsWList;
    private ArrayList<ClinicalCounsellingWorker> clinicalCWList;
    private ArrayList<PatientMedicineRequest> patientMedicinesR;
    private ArrayList<ChatWithRehabDocWorker> rehabDocChatW;
    private ArrayList<TalkToAgentWorker> taltoAgentW;
            
            
    public PatientRequest() {
        patientConditionsWList = new ArrayList<>();
        clinicalCWList = new ArrayList<>();
        patientMedicinesR = new ArrayList<>();
        rehabDocChatW= new ArrayList<>();
        taltoAgentW= new ArrayList<>();
    }
    
    public ArrayList<ChatWithRehabDocWorker> getChatWithRehabDocWorker() {
        return rehabDocChatW;
    }

    public void setChatWithRehabDocWorker(ChatWithRehabDocWorker rehabDocChatW) {
        this.rehabDocChatW.add(rehabDocChatW);
    }
    
    public ArrayList<TalkToAgentWorker> getTalkToAgentWorker() {
        return taltoAgentW;
    }

    public void setTalkToAgentWorker(TalkToAgentWorker taltoAgentW) {
        this.taltoAgentW.add(taltoAgentW);
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

    public SuicideIdeationRequest getSuidiceIdeation() {
        return suidiceIdeation;
    }

    public void setSuidiceIdeation(SuicideIdeationRequest suidiceIdeation) {
        this.suidiceIdeation = suidiceIdeation;
    }

    public PrescriptionNotesWorker getPrecriptionNotesWList() {
        return precriptionNotesWList;
    }

    public void setPrecriptionNotesWList(PrescriptionNotesWorker precriptionNotesWList) {
        this.precriptionNotesWList = precriptionNotesWList;
    }

    public PrescriptionMedicineRequest getPrescriptionMedicineRList() {
        return prescriptionMedicineRList;
    }

    public void setPrescriptionMedicineRList(PrescriptionMedicineRequest prescriptionMedicineRList) {
        this.prescriptionMedicineRList = prescriptionMedicineRList;
    }

    public HospitalAdmissionRequest getHospAdmissionRequest() {
        return hospAdmissionRequest;
    }

    public void setHospAdmissionRequest(HospitalAdmissionRequest hospAdmissionRequest) {
        this.hospAdmissionRequest = hospAdmissionRequest;
    }

    public DischargePatientRequest getDischargePatient() {
        return dischargePatient;
    }

    public void setDischargePatient(DischargePatientRequest dischargePatient) {
        this.dischargePatient = dischargePatient;
    }

    public BillGeneratorWorker getBillGWList() {
        return billGWList;
    }

    public void setBillGWList(BillGeneratorWorker billGWList) {
        this.billGWList = billGWList;
    }
    
    public BillingWorker getBillingW() {
        return billingW;
    }

    public void setBillingW(BillingWorker billingW) {
        this.billingW = billingW;
    }
    
    public ArrayList<PatientMedicineRequest> getPatientMedicinesR() {
        return patientMedicinesR;
    }

    public void setPatientMedicines(PatientMedicineRequest patientMedicines) {
        this.patientMedicinesR.add(patientMedicines);
    }
    
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }
}