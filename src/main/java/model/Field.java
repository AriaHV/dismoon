package model;

public class Field {
    // Position on the farm
    private long position;

    // Currently planted crop, is null if no crop is planted
    private Crop crop;

    // Indicates whether the field is currently fertalized
    private boolean isFertalized;
}
