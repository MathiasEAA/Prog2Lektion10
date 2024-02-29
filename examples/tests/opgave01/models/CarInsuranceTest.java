package opgave01.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @Test
    @DisplayName("Premium for Male 18 years, 0 yearsExperience")
    void calculatePremiumMale18Years0Experience() {
        CarInsurance carInsurance = new CarInsurance(1000);
        double actual = carInsurance.calculatePremium(18,false,0);
        double expected = 1250.0;

        assertEquals(expected,actual,0.1);
    }

    @Test
    @DisplayName("Premium for Male 25 years, 5 yearsExperience")
    void calculatePremiumMale25Years5Experience() {
        CarInsurance carInsurance = new CarInsurance(1000);
        double actual = carInsurance.calculatePremium(25,false,5);
        double expected = 850;

        assertEquals(expected,actual,0.1);
    }

    @Test
    @DisplayName("Premium for Female 30 years, 9 yearsExperience")
    void calculatePremiumFemale30Years9Experience() {
        CarInsurance carInsurance = new CarInsurance(1000);
        double actual = carInsurance.calculatePremium(30,true,9);
        double expected = 617.5;

        assertEquals(expected,actual,0.1);
    }

    /**
     * @Test
     *     @DisplayName("ThrowsError")
     *     void calculatePremiumThrowsError() {
     *         CarInsurance carInsurance = new CarInsurance(1000);
     *         double actual = carInsurance.calculatePremium(15,true,9);
     *         double expected = 617.5;
     *
     *         assertEquals(expected,actual,0.1);
     *     }
     */

}