package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void WaveTest() {
        Radio wave = new Radio();

        wave.setWave(5);

        int expected = 5;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void waveAboveLimitTest() {
        Radio wave = new Radio();

        wave.setWave(10);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void waveUnderLimitTest() {
        Radio wave = new Radio();

        wave.setWave(-1);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextWaveTest() {
        Radio wave = new Radio();

        wave.setWave(9);
        wave.nextWave();

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWaveAboveLimitTest() {
        Radio wave = new Radio();

        wave.setWave(11);
        wave.nextWave();

        int expected = 1;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWaveUnderLimitTest() {
        Radio wave = new Radio();

        wave.setWave(-1);
        wave.nextWave();

        int expected = 1;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveTest() {
        Radio wave = new Radio();

        wave.setWave(0);
        wave.prevWave();

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveAroundLimitTest() {
        Radio wave = new Radio();

        wave.setWave(9);
        wave.prevWave();

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveAboveLimitTest() {
        Radio wave = new Radio();

        wave.setWave(10);
        wave.prevWave();

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveUnderLimitTest() {
        Radio wave = new Radio();

        wave.setWave(-1);
        wave.prevWave();

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio volume = new Radio();

        volume.setVolume(50);
        volume.increaseVolume();

        int expected = 51;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveLimitTest() {
        Radio volume = new Radio();

        volume.setVolume(102);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderLimitTest() {
        Radio volume = new Radio();

        volume.setVolume(-6);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTest() {
        Radio volume = new Radio();

        volume.setVolume(37);
        volume.decreaseVolume();

        int expected = 36;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeAboveLimitTest() {
        Radio volume = new Radio();

        volume.setVolume(123);
        volume.decreaseVolume();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderLimitTest() {
        Radio volume = new Radio();

        volume.setVolume(-26);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
