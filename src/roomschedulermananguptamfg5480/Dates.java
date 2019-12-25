/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomschedulermananguptamfg5480;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
/**
 *
 * @author manangupta
 */
public class Dates {
    private static Connection connection;
    private static ArrayList<Date> dates = new ArrayList<Date>();
    private static PreparedStatement addDate;
    private static PreparedStatement getAllDates;
    private static ResultSet resultSet;
    
    public static void addDate(String date_input){
        connection = DBConnection.getConnection();
        try
        {
            Date date = Date.valueOf(date_input);
            addDate = connection.prepareStatement("insert into dates (date) values (?)");
            addDate.setDate(1, date);
            addDate.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    public static ArrayList<Date> getAllDates()
    {
        connection = DBConnection.getConnection();
        ArrayList<Date> dates = new ArrayList<Date>();
        try
        {
            getAllDates = connection.prepareStatement("select date from dates order by date");
            resultSet = getAllDates.executeQuery();
            
            while(resultSet.next())
            {
                dates.add(resultSet.getDate(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return dates;
        
    }
    
}
