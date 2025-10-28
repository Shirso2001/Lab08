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
            list = new CustomList(null, new ArrayList<>());
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


}
