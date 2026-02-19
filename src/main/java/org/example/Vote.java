package org.example;

public class Vote {
    int id;
    String name;

    public Vote(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
