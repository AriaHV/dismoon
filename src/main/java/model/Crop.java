package model;

/*
Represents a planted seed and keeps track of its growth and hydration state.
 */
public class Crop {
    // Seed that is planted
    private Seed seed;

    // Time at maturation in miliseconds
    private long maturationTime;

    // Time at dehydration in miliseconds
    private long dehydrationTime;

    public Crop(Seed seed) {
        this.seed = seed;
        this.plant();
    }

    /* Waters a crop. Setting its dehydrationTime */
    public void water() {
        dehydrationTime = System.currentTimeMillis() + seed.getDehydrationTime();
    }

    /* Plants a seed and waters it. Setting its maturationTime and dehydrationTime */
    public void plant() {
        maturationTime = System.currentTimeMillis() + seed.getMaturationTime();
        water();
    }

    /* Indicates whether a crop is dead due to dehydration. */
    public boolean isDead() { ;
        if (System.currentTimeMillis() < dehydrationTime) return false;
        if (maturationTime < dehydrationTime) return false;
        return true;
    }

    /* Indicates whether a crop is mature. */
    public boolean isMature() {
        if (isDead()) return false;
        if (System.currentTimeMillis() < maturationTime) return false;
        return true;
    }
}
