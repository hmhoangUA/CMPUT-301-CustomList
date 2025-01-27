package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }

    @Test
    public void countCityTest() {
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(1, list.countCity(city));
    }
}
