package ru.an1s9n.spring.boot.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PropertyServiceTest {

  @Autowired
  private PropertyService propertyService;

  @Test
  void getProperties_expectCorrectValues() {
    assertEquals("bar property one value from config", propertyService.getBarPropertyOne());
    assertEquals("bar property two default value", propertyService.getBarPropertyTwo());
    assertEquals("foo property one value from config", propertyService.getFooPropertyOne());
    assertEquals("foo property two default value", propertyService.getFooPropertyTwo());
  }

}
