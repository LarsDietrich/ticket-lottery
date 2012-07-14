package lotto.model;
// Generated Dec 5, 2009 7:37:40 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * VenueSeat generated by hbm2java
 */
public class VenueSeat  implements java.io.Serializable {


     private VenueSeatId id;
     private VenueRow venueRow;
     private Set lotterySeats = new HashSet(0);

    public VenueSeat() {
    }

	
    public VenueSeat(VenueSeatId id, VenueRow venueRow) {
        this.id = id;
        this.venueRow = venueRow;
    }
    public VenueSeat(VenueSeatId id, VenueRow venueRow, Set lotterySeats) {
       this.id = id;
       this.venueRow = venueRow;
       this.lotterySeats = lotterySeats;
    }
   
    public VenueSeatId getId() {
        return this.id;
    }
    
    public void setId(VenueSeatId id) {
        this.id = id;
    }
    public VenueRow getVenueRow() {
        return this.venueRow;
    }
    
    public void setVenueRow(VenueRow venueRow) {
        this.venueRow = venueRow;
    }
    public Set getLotterySeats() {
        return this.lotterySeats;
    }
    
    public void setLotterySeats(Set lotterySeats) {
        this.lotterySeats = lotterySeats;
    }
    public void addLotterySeat(LotterySeat lotterySeat) {
        lotterySeat.setVenueSeat(this);
        lotterySeats.add(lotterySeat);
    }



}

