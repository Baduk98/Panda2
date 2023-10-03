package ru.netology.radio;

public class Radio {

    private int volume;
    private int waves;


    public int getWave() {
        return waves;
    }
    public int getVolume() {
        return volume;
    }

    public void setWave(int newWave) {

        if (newWave < 0) {
            return;
        }
        if (newWave > 9) {
            return;
        }
        waves = newWave;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public void nextWave() {

        if (waves < 9) {
            waves++;
        } else {
            waves = 0;
        }
        if (waves < 0) {
            waves = 9;
        }
    }


    public void prevWave() {

        if (waves < 9) {
            waves--;
        }

        if (waves < 0) {
            waves = 9;
        }

        if (waves > 9) {
            waves = 0;
        }
    }

    public void increaseVolume() {

        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {

        if (volume < 100) {
            volume--;
        }
        if (volume < 0) {
            volume = 0;
        }
    }
}


