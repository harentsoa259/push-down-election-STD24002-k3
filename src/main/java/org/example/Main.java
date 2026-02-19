package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DataRetriewer d = new DataRetriewer();
        long Data = d.countAllVotes();
        System.out.println("Total Votes : " + Data);


    }
}