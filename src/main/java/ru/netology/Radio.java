package ru.netology;

public class Radio {

    private int currentStation;
    private int volume;
    private int numberOfStations = 9;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        if (numberOfStations < 0) {
            return;
        }
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 1) {
            currentStation = 1;
        }
        if (currentStation > numberOfStations +1) {
             currentStation = numberOfStations + 1;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < numberOfStations) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 1;
        }
    }

    public void prevStation() {
        if (currentStation > 1) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberOfStations + 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
