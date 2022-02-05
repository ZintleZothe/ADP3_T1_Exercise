
/**
 * Product.java
 * This is test class for sportsEquipment.java
 * @author Zintle Zothe (216130565)
 * 03 February 2022
 */
package za.ac.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class sportsEquipmentTest {
    @Test
    @DisplayName("Object equality test")
    void getEquipmentCode(){


        sportsEquipment equipment1= new sportsEquipment(668,"hockey stick",30.50,90);
        sportsEquipment equipment2= new sportsEquipment(128,"Jump rope",50.00,30);
        sportsEquipment equipment3= new sportsEquipment(594,"Soccer ball",72.30,10);
        sportsEquipment equipment4= new sportsEquipment(576,"boxing gloves",90.99,45);

        Assertions.assertAll(() -> assertEquals(668, equipment1.getEquipmentCode()),
                             () -> assertEquals(128,equipment2.getEquipmentCode()),
                             () -> assertEquals(594,equipment3.getEquipmentCode()),
                             () -> assertEquals(576,equipment4.getEquipmentCode()));


    }

    @Test
    @DisplayName("Object identity test")
    void getEquipmentName(){

        sportsEquipment equipment1= new sportsEquipment(668,"hockey stick",30.50,90);
        sportsEquipment equipment2= new sportsEquipment(128,"Jump rope",50.00,30);
        sportsEquipment equipment3= new sportsEquipment(594,"Soccer ball",72.30,10);
        sportsEquipment equipment4= new sportsEquipment(576,"boxing gloves",90.99,45);

        //checks if the sports equipment names are mot the same
        assertNotSame("Soccer ball",equipment1.getEquipmentName());
        assertNotSame("boxing gloves",equipment2.getEquipmentName());

        //checks if the sports equipment names are the same
        assertSame("Soccer ball",equipment3.getEquipmentName());
        assertSame("hockey stick",equipment1.getEquipmentName());

    }

    @Test
    @DisplayName("failing test")
    void getUnitPrice(){
        sportsEquipment equipment1= new sportsEquipment(668,"hockey stick",30.50,90);
        sportsEquipment equipment2= new sportsEquipment(128,"Jump rope",50.00,30);
        sportsEquipment equipment3= new sportsEquipment(594,"Soccer ball",72.30,10);
        sportsEquipment equipment4= new sportsEquipment(576,"boxing gloves",90.99,45);


        assertEquals(equipment1.getUnitPrice(),equipment2.getUnitPrice());
    }

    @Test
    @DisplayName("Timeout test")
    @Timeout(5)
    public void timeOutTest(){
        System.out.println("timeout test successful");
    }


    @Test
    @DisplayName("Disabling test")
    @Disabled
    void getEquipmentQuantity(){
        sportsEquipment equipment1= new sportsEquipment(668,"hockey stick",30.50,90);
        sportsEquipment equipment2= new sportsEquipment(128,"Jump rope",50.00,30);
        sportsEquipment equipment3= new sportsEquipment(594,"Soccer ball",72.30,10);
        sportsEquipment equipment4= new sportsEquipment(576,"boxing gloves",90.99,45);


        assertEquals(equipment1.getEquipmentQuantity(), equipment2.getEquipmentQuantity());// expected to fail p1 is not equal to p2
        assertEquals(equipment1.getEquipmentQuantity(), equipment1.getEquipmentQuantity());

    }



}