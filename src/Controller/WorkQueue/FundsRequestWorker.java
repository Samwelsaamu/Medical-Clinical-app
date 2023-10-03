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
public class FundsRequestWorker extends WorkRequest{
    
    private String requesteResult;
    private double amount,resolvedAmount;
    
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getResolvedAmount() {
        return resolvedAmount;
    }

    public void setResolvedAmount(double resolvedAmount) {
        this.resolvedAmount = resolvedAmount;
    }
    
}