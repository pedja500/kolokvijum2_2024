package rs.ac.ni.pmf.oop2.kol2.tennisPlayers;

import java.util.Arrays;
import java.util.List;

public class GrandSlamRepository {
    public  PlayerRepository playerRepository = new PlayerRepository();
    private final List<GrandSlam> listOfGrandSlams =Arrays.asList(
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2001 ,findPlayer("Andre Agassi")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2001, findPlayer("Gustavo Kuerten")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2001, findPlayer("Goran Ivanisevic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2001,findPlayer("Lleyton Hewitt")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2002 ,findPlayer("Thomas Johansson")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2002, findPlayer("Albert Costa")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2002, findPlayer("Lleyton Hewitt")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2002,findPlayer("Pete Sampras")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2003 ,findPlayer("Andre Agassi")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2003, findPlayer("Juan Carlos Ferrero")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2003, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2003,findPlayer("Andy Roddick")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2004 ,findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2004, findPlayer("Gaston Gaudio")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2004, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2004,findPlayer("Roger Federer")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2005 ,findPlayer("Marat Safin")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2005, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2005, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2005,findPlayer("Roger Federer")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2006 ,findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2006, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2006, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2006,findPlayer("Roger Federer")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2007 ,findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2007, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2007, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2007,findPlayer("Roger Federer")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2008 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2008, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2008, findPlayer("Rafael Nadal")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2008,findPlayer("Roger Federer")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2009 ,findPlayer("Rafael Nadal")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2009, findPlayer("Roger Federer")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2009, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2009,findPlayer("Huan Martin Del Potro")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2010 ,findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2010, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2010, findPlayer("Rafael Nadal")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2010,findPlayer("Rafael Nadal")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2011 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2011, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2011, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2011,findPlayer("Novak Djokovic")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2012 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2012, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2012, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2012,findPlayer("Andy Murray")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2013 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2013, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2013, findPlayer("Andy Murray")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2013,findPlayer("Rafael Nadal")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2014 ,findPlayer("Stan Wawrinka")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2014, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2014, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2014,findPlayer("Marin Cilic")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2015 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2015, findPlayer("Stan Wawrinka")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2015, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2015,findPlayer("Novak Djokovic")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2016 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2016, findPlayer("Novak Djokovic")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2016, findPlayer("Andy Murray")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2016,findPlayer("Stan Wawrinka")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2017 ,findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2017, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2017, findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2017,findPlayer("Rafael Nadal")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2018 ,findPlayer("Roger Federer")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2018, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2018, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2018,findPlayer("Novak Djokovic")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2019 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2019, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2019, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2019,findPlayer("Rafael Nadal")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2020 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2020, findPlayer("Rafael Nadal")),                                                                                            new GrandSlam(GrandSlam.Tournament.US_OPEN,2020,findPlayer("Dominic Thiem")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2021 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2021, findPlayer("Novak Djokovic")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2021, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2021,findPlayer("Daniil Medvedev")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2022 ,findPlayer("Rafael Nadal")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2022, findPlayer("Rafael Nadal")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2022, findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2022,findPlayer("Carlos Alcaraz")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2023 ,findPlayer("Novak Djokovic")), new GrandSlam(GrandSlam.Tournament.ROLAND_GARROS,2023, findPlayer("Novak Djokovic")),  new GrandSlam(GrandSlam.Tournament.WIMBLEDON,2023, findPlayer("Carlos Alcaraz")), new GrandSlam(GrandSlam.Tournament.US_OPEN,2023,findPlayer("Novak Djokovic")),
            new GrandSlam(GrandSlam.Tournament.AUSTRALIAN_OPEN,2024 ,findPlayer("Jannik Sinner"))
            );



    public List<GrandSlam> findAll() {
        return listOfGrandSlams;
    }

    public  Player findPlayer(final String name) {
        return null;
    }

}
