package lotto.model;
// Generated Dec 5, 2009 7:37:40 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * LotterySeat generated by hbm2java
 */
public class LotterySeat  implements java.io.Serializable {


     private LotterySeatId id;
     private LotteryEvent lotteryEvent;
     private VenueSeat venueSeat;
     private StudentInfo studentInfo;
     private StudentGroup studentGroup;
     private Double price;
     private Short claimed;
     private Date claimTime;
     private Short paid;
     private Date paidTime;

    public LotterySeat() {
    }

	
    public LotterySeat(LotterySeatId id, LotteryEvent lotteryEvent, VenueSeat venueSeat) {
        this.id = id;
        this.lotteryEvent = lotteryEvent;
        this.venueSeat = venueSeat;
    }
    public LotterySeat(LotterySeatId id, LotteryEvent lotteryEvent, VenueSeat venueSeat, StudentInfo studentInfo, StudentGroup studentGroup, Double price, Short claimed, Date claimTime, Short paid, Date paidTime) {
       this.id = id;
       this.lotteryEvent = lotteryEvent;
       this.venueSeat = venueSeat;
       this.studentInfo = studentInfo;
       this.studentGroup = studentGroup;
       this.price = price;
       this.claimed = claimed;
       this.claimTime = claimTime;
       this.paid = paid;
       this.paidTime = paidTime;
    }
   
    public LotterySeatId getId() {
        return this.id;
    }
    
    public void setId(LotterySeatId id) {
        this.id = id;
    }
    public LotteryEvent getLotteryEvent() {
        return this.lotteryEvent;
    }
    
    public void setLotteryEvent(LotteryEvent lotteryEvent) {
        this.lotteryEvent = lotteryEvent;
    }
    public VenueSeat getVenueSeat() {
        return this.venueSeat;
    }
    
    public void setVenueSeat(VenueSeat venueSeat) {
        this.venueSeat = venueSeat;
    }
    public StudentInfo getStudentInfo() {
        return this.studentInfo;
    }
    
    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }
    public StudentGroup getStudentGroup() {
        return this.studentGroup;
    }
    
    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Short getClaimed() {
        return this.claimed;
    }
    
    public void setClaimed(Short claimed) {
        this.claimed = claimed;
    }
    public Date getClaimTime() {
        return this.claimTime;
    }
    
    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }
    public Short getPaid() {
        return this.paid;
    }
    
    public void setPaid(Short paid) {
        this.paid = paid;
    }
    public Date getPaidTime() {
        return this.paidTime;
    }
    
    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }




}


