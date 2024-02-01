package rs.ac.ni.pmf.oop2.kol2.tennisPlayers;

import lombok.Value;

@Value
public class GrandSlam {
    Tournament tournament;
    int year;
    Player winner;
    public enum Tournament {
        AUSTRALIAN_OPEN,
        ROLAND_GARROS,
        WIMBLEDON,
        US_OPEN
    }

}
