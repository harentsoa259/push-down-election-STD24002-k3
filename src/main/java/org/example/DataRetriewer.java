package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public List<VoteTypeCount> countVotesByType() {
        List<VoteTypeCount> list = new ArrayList<>();
        String sql = "SELECT vote_type, COUNT(id) FROM vote GROUP BY vote_type";
        DBConnection dbc = new DBConnection();

        try (Connection conn = dbc.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String typeStr = rs.getString(1);
                Vote_type typeEnum = Vote_type.valueOf(typeStr);
                long count = rs.getLong(2);

                list.add(new VoteTypeCount(typeEnum, count));
            }
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors du comptage par type", e);
        }
        return list;
    }
}
