package model;

public class Crop {
    // ID of the seed that is planted
    private long seedId;

    // Time at planting the seeds in miliseconds
    private long plantTime;

    // Time at latest watering in miliseconds
    private long waterTime;

    // Indicates whether the field was fertilized when the seed was planted
    private boolean isFertalized;
}
