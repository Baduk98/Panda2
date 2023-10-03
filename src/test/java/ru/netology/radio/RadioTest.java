package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

        wave.nextWave(2);

        int expected = 3;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWaveAboveLimitTest() {
        Radio wave = new Radio();

        wave.nextWave(10);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWaveUnderLimitTest() {
        Radio wave = new Radio();

        wave.nextWave(-2);

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveTest() {
        Radio wave = new Radio();

        wave.prevWave(7);

        int expected = 6;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveAboveLimitTest() {
        Radio wave = new Radio();

        wave.prevWave(11);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWaveUnderLimitTest() {
        Radio wave = new Radio();

        wave.prevWave(-1);

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio volume = new Radio();

        volume.increaseVolume(50);

        int expected = 51;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveLimitTest() {
        Radio volume = new Radio();

        volume.increaseVolume(102);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderLimitTest() {
        Radio volume = new Radio();

        volume.increaseVolume(-6);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTest() {
        Radio volume = new Radio();

        volume.decreaseVolume(37);

        int expected = 36;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeAboveLimitTest() {
        Radio volume = new Radio();

        volume.decreaseVolume(123);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderLimitTest() {
        Radio volume = new Radio();

        volume.decreaseVolume(-26);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
