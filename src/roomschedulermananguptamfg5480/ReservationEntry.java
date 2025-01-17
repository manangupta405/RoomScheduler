/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomschedulermananguptamfg5480;


import java.util.Calendar;
import java.sql.Timestamp;
import java.sql.Date;

/**
 *
 * @author manangupta
 */
public class ReservationEntry {
    private final String faculty_name;
    private final String room;
    private final Date date;
    private final int seats;
    private final Timestamp timestamp;

    public ReservationEntry(String faculty, String room, Date date, int seats, Timestamp timestamp){
        this.faculty_name = faculty;
        this.room = room;
        this.date = date;
        this.seats = seats;
        this.timestamp = timestamp;
    }
    public ReservationEntry(String faculty, String room, Date date, int seats){
        this.faculty_name = faculty;
        this.room = room;
        this.date = date;
        this.seats = seats;
        this.timestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
    }
    
    public String getFaculty(){
        return this.faculty_name;
    }
    
    public String getRoom(){
        return this.room;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public int getSeats(){
        return this.seats;
    }
    
    public Timestamp getTimestamp(){
        return this.timestamp;
    }
    
}
