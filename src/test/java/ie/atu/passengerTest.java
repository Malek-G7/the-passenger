package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class passengerTest {
    passenger myPassenger ;

    @BeforeEach
    void setup(){
    }
    @AfterEach
    void teardown(){
    }

    @Test
    void testConstuctorSuccessTitle() {
        myPassenger = new passenger("Mr","Malek","g000387032","0830593772",22);
        assertEquals("Mr",myPassenger.getTitle());
    }
    @Test
    void testConstuctorSuccessName() {
        myPassenger = new passenger("Mr","Malek","g000387032","0830593772",22);
        assertEquals("Malek",myPassenger.getName());
    }
    @Test
    void testConstuctorSuccessID() {
        myPassenger = new passenger("Mr","Malek","g000387032","0830593772",22);
        assertEquals("g000387032",myPassenger.getID());
    }
    @Test
    void testConstuctorSuccessPhone() {
        myPassenger = new passenger("Mr","Malek","g000387032","0830593772",22);
        assertEquals("0830593772",myPassenger.getPhone());
    }
    @Test
    void testConstuctorSuccessAge() {
        myPassenger = new passenger("Mr","Malek","g000387032","0830593772",22);
        assertEquals(22,myPassenger.getAge());
    }

}
