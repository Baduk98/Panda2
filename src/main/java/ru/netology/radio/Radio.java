package ru.netology.radio;

public class Radio {

    public int currentVolume;
    public int Wave;


    public int getWave() {
        return Wave;
    }
    public int getVolume() {
        return currentVolume;
    }

    public void setWave(int newWave) {

        if (newWave < 0) {
            return;
        }
        if (newWave > 9) {
            return;
        }


        Wave = newWave;
    }

    public void nextWave(int next) {

        if (next < 9) {
            next++;
        } else {
            next = 0;
        }
        if (next < 0) {
            next = 9;
        }
        Wave = next;

    }


    public void prevWave(int prev) {

        if (prev < 0) {
            prev = 9;
        } else {
            prev--;
        }
        if (prev > 9) {
            prev = 0;
        }
        Wave = prev;
    }

    public void increaseVolume(int increase) {

        if (increase < 100) {
            increase++;
        } else {
            increase = 100;
        }
        if (increase < 0) {
            increase = 0;
        }
        currentVolume = increase;
    }

    public void decreaseVolume(int decrease) {

        if (decrease < 0) {
            decrease = 0;
        } else {
            decrease--;
        }
        if (decrease > 100) {
            decrease = 100;
        }

        currentVolume = decrease;
    }
}


