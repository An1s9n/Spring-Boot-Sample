package ru.an1s9n.spring.boot.sample.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.an1s9n.spring.boot.sample.config.properties.BarProperties;
import ru.an1s9n.spring.boot.sample.config.properties.FooProperties;

@Service
@RequiredArgsConstructor
public class PropertyService {

  private final BarProperties barProperties;
  private final FooProperties fooProperties;

  public String getBarPropertyOne() {
    return barProperties.getPropertyOne();
  }

  public String getBarPropertyTwo() {
    return barProperties.getPropertyTwo();
  }

  public String getFooPropertyOne() {
    return fooProperties.propertyOne();
  }

  public String getFooPropertyTwo() {
    return fooProperties.propertyTwo();
  }

}
