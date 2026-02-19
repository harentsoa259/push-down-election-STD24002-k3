package org.example;

public class VoteTypeCount {
    private Vote_type type;
    private long count;

    public VoteTypeCount(Vote_type type, long count) {
        this.type = type;
        this.count = count;
    }

    public Vote_type getType() {
        return type;
    }

    public void setType(Vote_type type) {
        this.type = type;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return "VoteTypeCount(voteType=" + type + ", count=" + count + ")";
    }
}
