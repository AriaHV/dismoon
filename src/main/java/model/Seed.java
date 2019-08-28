package model;

/*
Representation of the
 */
public class Seed {

    private long seedId;

    // Time until crop maturation in ms
    private long maturationTime;

    // Time until crop dehydration in ms
    private long dehydrationTime;

    public long getSeedId() {
        return seedId;
    }

    public long getMaturationTime() {
        return maturationTime;
    }

    public long getDehydrationTime() {
        return dehydrationTime;
    }



}
