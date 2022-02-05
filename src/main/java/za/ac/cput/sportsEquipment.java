/**
 * sportsEquipment.java
 * This is the model and main class : list the equipment available.
 * @author Zintle Zothe (216130565)
 * 03 February 2022
 */


package za.ac.cput;


public class sportsEquipment {

    private long equipmentCode;
    private String equipmentName;
    private double UnitPrice;
    private int equipmentQuantity;

    public sportsEquipment(long equipmentCode, String equipmentName, double UnitPrice, int equipmentQuantity){
        this.equipmentCode = equipmentCode;
        this.equipmentName = equipmentName;
        this.UnitPrice = UnitPrice;
        this.equipmentQuantity = equipmentQuantity;
    }

    //getters

    public long getEquipmentCode() {
        return equipmentCode;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public int getEquipmentQuantity() {
        return equipmentQuantity;
    }

    //setters

    public void setEquipmentCode(long equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public void setUnitPrice(double unitPrice) {
        this.UnitPrice = unitPrice;
    }

    public void setEquipmentQuantity(int equipmentQuantity) {
        this.equipmentQuantity = equipmentQuantity;
    }

    public String toString() {
        return "Equipment code = " + equipmentCode +
                ", equipment name= " + equipmentName +
                ", unit price= R" + UnitPrice +
                ", equipment quantity= " + equipmentQuantity +
                '}'+ '\n';
    }

    public static void main(String[] args){


        sportsEquipment equipment1= new sportsEquipment(668,"hockey stick",30.50,90);
        sportsEquipment equipment2= new sportsEquipment(128,"Jump rope",50.00,30);
        sportsEquipment equipment3= new sportsEquipment(594,"Soccer ball",72.30,10);
        sportsEquipment equipment4= new sportsEquipment(576,"boxing gloves",90.99,45);


        System.out.println("Sports equipment list:");
        System.out.println(equipment1.toString());
        System.out.println(equipment2.toString());
        System.out.println(equipment3.toString());
        System.out.println(equipment4.toString());
    }
}
