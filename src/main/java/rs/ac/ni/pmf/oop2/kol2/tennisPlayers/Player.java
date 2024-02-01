package rs.ac.ni.pmf.oop2.kol2.tennisPlayers;

import lombok.Value;

import java.time.LocalDate;
@Value
public class Player {
     String name;
     String nationality;
     LocalDate dateOfBirth;

}
