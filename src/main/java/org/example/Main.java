package org.example;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataRetriewer d = new DataRetriewer();
        long Data = d.countAllVotes();
        System.out.println("Total Votes : " + Data);

        DataRetriewer dr = new DataRetriewer();
        List<VoteTypeCount> results = dr.countVotesByType();
        System.out.println(results);
    }
}