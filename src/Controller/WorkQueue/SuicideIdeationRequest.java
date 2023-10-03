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
public class SuicideIdeationRequest extends WorkRequest{

    //assigns to mhw workOrder and then routes to psychiatrist and ccm
    private String requestedSuicideResult;
    private PatientRequest workOrderR;
    private HospitalAdmissionRequest hospAdmissionRequest;

    public String getRequestedSuicideResult() {
        return requestedSuicideResult;
    }

    //only routes to availble agents and receivers to ensure WorkOrder is urgently received to save life
    public void setRequestedSuicideResult(String requestedSuicideResult) {
        this.requestedSuicideResult = requestedSuicideResult;
    }
    
    public PatientRequest getWorkOrderR() {
        return workOrderR;
    }

    public void setWorkOrderR(PatientRequest workOrderR) {
        this.workOrderR = workOrderR;
    }
   
    public HospitalAdmissionRequest getHospAdmissionRequest() {
        return hospAdmissionRequest;
    }

    public void setHospAdmissionRequest(HospitalAdmissionRequest hospAdmissionRequest) {
        this.hospAdmissionRequest = hospAdmissionRequest;
    }
}