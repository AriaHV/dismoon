package model;

import static org.junit.jupiter.api.Assertions.*;

class CropTest {

    @org.junit.jupiter.api.Test
    void isDead() {
        Seed seed = new Seed(0, 1000, 2000);
        Crop crop = new Crop(seed, 0);
        assertEquals(crop.isDead(500), false);
        assertEquals(crop.isDead(1500), false);
        assertEquals(crop.isDead(2500), false);

        seed = new Seed(0, 2000, 1000);
        crop = new Crop(seed, 0);
        assertEquals(crop.isDead(500), false);
        assertEquals(crop.isDead(1500), true);
        assertEquals(crop.isDead(2500), true);
    }

    @org.junit.jupiter.api.Test
    void isMature() {
        Seed seed = new Seed(0, 1000, 2000);
        Crop crop = new Crop(seed, 0);
        assertEquals(crop.isMature(500), false);
        assertEquals(crop.isMature(1500), true);
        assertEquals(crop.isMature(2500), true);

        seed = new Seed(0, 2000, 1000);
        crop = new Crop(seed, 0);
        assertEquals(crop.isMature(500), false);
        assertEquals(crop.isMature(1500), false);
        assertEquals(crop.isMature(2500), false);
    }

    @org.junit.jupiter.api.Test
    void water() {
        Seed seed = new Seed(0, 2000, 1000);
        Crop crop = new Crop(seed, 0);
        crop.water(550);
        assertEquals(crop.isDead(500), false);
        assertEquals(crop.isDead(1500), false);
        assertEquals(crop.isDead(1600), true);
    }
}