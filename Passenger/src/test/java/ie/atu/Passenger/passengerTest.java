package ie.atu.Passenger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class passengerTest {

    @Test
    void testConstuctorSuccessTitle() {
        assertEquals("Mr", new passenger("Mr","Malek","g000387032","0830593772",22).getTitle());
        assertEquals("Mrs", new passenger("Mrs","Malek","g000387032","0830593772",22).getTitle());
        assertEquals("Ms", new passenger("Ms","Malek","g000387032","0830593772",22).getTitle());
    }
    @Test
    void testConstuctorSuccessName() {
        assertEquals("Malek",new passenger("Mr","Malek","g000387032","0830593772",22).getName());
    }
    @Test
    void testConstuctorSuccessID() {
        assertEquals("g000387032",new passenger("Mr","Malek","g000387032","0830593772",22).getID());
    }
    @Test
    void testConstuctorSuccessPhone() {
        assertEquals("0830593772",new passenger("Mr","Malek","g000387032","0830593772",22).getPhone());
    }
    @Test
    void testConstuctorSuccessAge() {
        assertEquals(22,new passenger("Mr","Malek","g000387032","0830593772",22).getAge());
    }
    @Test
    void testConstructorFailTitle() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("DR","Malek","g000387032","0830593772",22);});
        assertEquals("This is not a valid title, try Mr, Mrs or Ms", ex.getMessage());
    }
    @Test
    void testConstructorFailName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","M","g000387032","0830593772",22);});
        assertEquals("name must contain min 3 characters", ex.getMessage());
    }
    @Test
    void testConstructorFailID() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","Malek","g00","0830593772",22);});
        assertEquals("ID must contain min 10 characters", ex.getMessage());
    }
    @Test
    void testConstructorFailPhone() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","Malek","g000387032","083",22);});
        assertEquals("phone no must contain min 7 characters", ex.getMessage());
    }
    @Test
    void testConstructorFailAge() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> { new passenger("Mr","Malek","g000387032","0830593772",12);});
        assertEquals("age must be 16 or higher", ex.getMessage());
    }
}
