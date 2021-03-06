package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(20);

    @Test
    void shouldChekSetCurrentStationIsNumberOfStations() {
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldChekSetCurrentStationOverNumbersOfStations() {
        radio1.setCurrentStation(21);
        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckSetCurrentStationLessZero() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCheckSetNumberOfStationsLessZero() {
        radio1.setNumberOfStations(-1);
        assertEquals(20, radio1.getNumberOfStations());
    }

    @Test
    void shouldCheckSetNumberOfStationsAboveZero() {
        radio1.setNumberOfStations(1);
        assertEquals(1, radio1.getNumberOfStations());
    }

    @Test
    void shouldCheckNextStationWhenCurrentStationIsZero() {
        radio.setCurrentStation(0);
        radio.nextStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationWhenCurrentStationIsNumberOfStations() {
        radio.setCurrentStation(10);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationWhenCurrentStationAboveNumberOfStations() {
        radio1.setCurrentStation(21);
        radio1.nextStation();

        assertEquals(1, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationWhenCurrentStationInTheMiddle() {
        radio.setCurrentStation(5);
        radio.nextStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationWhenCurrentStationIsZero() {
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationWhenCurrentStationIsNumberOfStations() {
        radio1.setCurrentStation(20);
        radio1.prevStation();

        assertEquals(19, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationWhenCurrentStationAboveNumberOfStations() {
        radio.setCurrentStation(11);
        radio.prevStation();

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationWhenCurrentStationInTheMiddle() {
        radio.setCurrentStation(6);
        radio.prevStation();

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldCheckIncreaseVolumeIfSetCurrentVolumeAboveOneHundred() {
        radio.setVolume(111);
        radio.increaseVolume();

        assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldCheckIncreaseVolumeIfSetCurrentVolumeIsOneHundred() {
        radio.setVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldCheckDecreaseVolumeIfSetCurrentVolumeAboveZero() {
        radio.setVolume(100);
        radio.decreaseVolume();

        assertEquals(99, radio.getVolume());
    }

    @Test
    void shouldCheckDecreaseVolumeIfSetCurrentVolumeLessZero() {
        radio.setVolume(-1);
        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }
}