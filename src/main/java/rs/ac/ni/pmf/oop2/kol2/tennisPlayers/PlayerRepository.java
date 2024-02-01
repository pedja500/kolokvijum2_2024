package rs.ac.ni.pmf.oop2.kol2.tennisPlayers;

import lombok.Value;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Value
public class PlayerRepository {
    List<Player> listOfTennisPlayers = Arrays.asList(
            new Player("Andre Agassi","USA", LocalDate.parse("1970-04-29")),
            new Player("Rafael Nadal", "Spain",LocalDate.parse("1986-06-03")),
            new Player("Gaston Gaudio", "Argentina", LocalDate.parse("1978-12-09")),
            new Player("Goran Ivanisevic","Yugoslavia/Croatia",LocalDate.parse("1971-09-13")),
            new Player("Lleyton Hewitt", "Australia", LocalDate.parse("1981-02-24")),
            new Player("Thomas Johansson","Sweden",LocalDate.parse("1981-02-24")),
            new Player("Albert Costa", "Spain", LocalDate.parse("1975-06-25")),
            new Player("Pete Sampras", "USA", LocalDate.parse("1971-08-12")),
            new Player("Juan Carlos Ferrero" ,"Spain", LocalDate.parse("1980-02-12")),
            new Player("Roger Federer","Switzerland",LocalDate.parse("1981-08-08")),
            new Player("Andy Roddick", "USA", LocalDate.parse("1982-08-30")),
          //  new Player("David Ferrer", "Spain", LocalDate.parse("1982-04-02")),
            new Player("Huan Martin Del Potro","Argentina", LocalDate.parse("1988-09-23")),
            new Player("Novak Djokovic", "SCG/Serbia", LocalDate.parse("1987-05-22")),
            new Player("Andy Murray","Great Britain", LocalDate.parse("1987-05-15")),
            new Player("Marin Cilic", "Croatia", LocalDate.parse("1988-09-28")),
            new Player("Jannik Sinner","Italy", LocalDate.parse("2001-08-16")),
            new Player("Carlos Alcaraz", "Spain", LocalDate.parse("2003-05-05")),
           // new Player("Miomir Kecmanovic", "Serbia", LocalDate.parse("1999-08-31")),
            new Player("Gustavo Kuerten","Brazil",LocalDate.parse("1976-09-10")),
            new Player("Stan Wawrinka", "Switzerland", LocalDate.parse("1985-03-28")),
            new Player("Dominic Thiem", "Austria", LocalDate.parse("1993-09-03")),
            new Player("Daniil Medvedev", "Russia", LocalDate.parse("1996-02-11")),
            new Player("Marat Safin", "Russia", LocalDate.parse("1980-01-27"))
    );
    public List<Player> findAll()
    {
        return listOfTennisPlayers;
    }
}
