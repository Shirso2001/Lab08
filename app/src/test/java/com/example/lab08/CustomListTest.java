package com.example.lab08;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {

        private CustomList list;

        @BeforeEach
        public void createList() {
            list = new CustomList();
        }

        @Test
        public void hasCityTest() {
            City city = new City("Edmonton", "AB");
            list.addCity(city);
            Assert.assertTrue(list.hasCity(city)); // Asserts that the supplied condition is true. [1, 2]
        }

        @Test
        public void hasCityFalseTest() {
            City city = new City("Edmonton", "AB");
            City otherCity = new City("Vancouver", "BC");
            list.addCity(city);
            Assert.assertFalse(list.hasCity(otherCity)); // Asserts that the supplied condition is false. [1, 2]
        }

        @Test
        public void deleteCityTest() {
            City city = new City("Calgary", "AB");
            list.addCity(city);
            assertTrue(list.hasCity(city));
            list.deleteCity(city);
            assertFalse(list.hasCity(city));
        }

        @Test
        public void countCitiesTest() {
            Assert.assertEquals(0, list.countCities());
            list.addCity(new City("Edmonton", "AB"));
            Assert.assertEquals(1, list.countCities());
            list.addCity(new City("Vancouver", "BC"));
            Assert.assertEquals(2, list.countCities());
        }


}
