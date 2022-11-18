package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerServices {
    public List<passenger> getPassengers(){
        List<passenger> myPassengers = List.of(
                new passenger("Mr", "Paul", "12r45455454533", "234543535L", 23),
                new passenger("Mr", "Paul2", "6735345345353423", "244345344L", 93),
                new passenger("Mr", "Paul3", "1453534534", "5345343562L", 53));
        return myPassengers;
    }
    @GetMapping("/{passengerID}")
    public passenger getPassenger(@PathVariable String passengerID){
        passenger myPassenger = new passenger("Mr", "Paul", "12r45455454533", "234543535L", 23);
        return myPassenger ;
    }
}
