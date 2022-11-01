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
    @Test
    void testConstructorFailTitle()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("DR","Malek","g000387032","0830593772",22);});
        assertEquals("This is not a valid title, try Mr, Mrs or Ms", ex.getMessage());
    }
    @Test
    void testConstructorFailName()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","M","g000387032","0830593772",22);});
        assertEquals("name must contain min 3 characters", ex.getMessage());
    }
    @Test
    void testConstructorFailID()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","Malek","g00","0830593772",22);});
        assertEquals("ID must contain min 10 characters", ex.getMessage());
    }
    @Test
    void testConstructorFailPhone()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","Malek","g000387032","083",22);});
        assertEquals("phone no must contain min 7 characters", ex.getMessage());
    }
    @Test
    void testConstructorFailAge()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","Malek","g000387032","0830593772",12);});
        assertEquals("age must be 16 or higher", ex.getMessage());
    }
}
