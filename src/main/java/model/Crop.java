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

    public Crop(Seed seed, long currentTime) {
        this.seed = seed;
        this.plant(currentTime);
    }

    /**
     *  Waters a crop. Setting its dehydrationTime
     */
    public void water(long currentTime) {
        dehydrationTime = currentTime + seed.getDehydrationTime();
    }

    /**
     * Plants a seed and waters it. Setting its maturationTime and dehydrationTime
     */
    public void plant(long currentTime) {
        maturationTime = currentTime + seed.getMaturationTime();
        water(currentTime);
    }

    /**
     * Indicates whether a crop is dead due to dehydration.
     */
    public boolean isDead(long currentTime) { ;
        if (currentTime < dehydrationTime) return false;
        if (maturationTime < dehydrationTime) return false;
        return true;
    }

    /**
     * Indicates whether a crop is mature.
     */
    public boolean isMature(long currentTime) {
        if (isDead(currentTime)) return false;
        if (currentTime < maturationTime) return false;
        return true;
    }
}
