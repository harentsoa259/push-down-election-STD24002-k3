package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataRetriewer {
    long countAllVotes(){
        DBConnection dbc = new DBConnection();
        long total =0;
        String countSQL = "SELECT COUNT(id) from vote;";
        try(Connection conn = dbc.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(countSQL);
            ResultSet rs = pstmt.executeQuery();) {
            if (rs.next()){
                total =rs.getLong(1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return total;
    }
}
