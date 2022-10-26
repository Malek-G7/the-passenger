package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class passengerTest {
    passenger myPassenger ;

    @BeforeEach
    void setup(){
        myPassenger = new passenger();
    }
    @AfterEach
    void teardown(){

    }
}
