package ru.netology.radio;

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume;
    private int minNumWave = 0;
    private int maxNumWave = 9;
    private int waves;
    private int countWave;

    public Radio(int maxNumWave) {
        this.countWave = maxNumWave + 1;
    }

    public Radio() {
        this.countWave = 10;
    }


    public int getCountWave() {
        return countWave;
    }

    public int getWave() {
        return waves;
    }

    public int getVolume() {
        return volume;
    }


    public void setWave(int newWave) {

        if (newWave < minNumWave) {
            return;
        }
        if (newWave > maxNumWave) {
            return;
        }
        waves = newWave;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        volume = newVolume;
    }

    public void nextWave() {

        if (waves < maxNumWave) {
            waves++;
        } else {
            waves = minNumWave;
        }
    }


    public void prevWave() {

        if (waves < maxNumWave) {
            waves--;
        }

        if (waves < minNumWave) {
            waves = maxNumWave;
        }
    }

    public void increaseVolume() {

        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {

        if (volume < maxVolume) {
            volume--;
        }
        if (volume < minVolume) {
            volume = minVolume;
        }
    }
}