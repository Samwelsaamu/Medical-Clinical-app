/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Medicine;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Medicine {
    
    private String name;
    private int id;
    private static int count = 1;
    private Long quantity;

    public Medicine() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name;
    }
}