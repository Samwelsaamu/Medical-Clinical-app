/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class MedicineDirectory {
    
    private ArrayList<Medicine> medicineList;

    public MedicineDirectory() {
        medicineList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }
    
    public Medicine createMedicine(String name,Long qty){
        Medicine medicine = new Medicine();
        medicine.setName(name);
        medicine.setQuantity(qty);
        medicineList.add(medicine);
        return medicine;
    }
    
    public boolean checkIfMedicineIsUnique(String medicinename){
        for (Medicine medicine : medicineList){
            if (medicine.getName().equals(medicinename))
                return false;
        }
        return true;
    }
}
