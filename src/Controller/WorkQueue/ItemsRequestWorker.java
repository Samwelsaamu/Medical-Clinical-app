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
public class ItemsRequestWorker extends WorkRequest{
    
    private String requesteResult;
    private double quantity,resolvedQty;
    
    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getResolvedQty() {
        return resolvedQty;
    }

    public void setResolvedQty(double resolvedQty) {
        this.resolvedQty = resolvedQty;
    }
    
}