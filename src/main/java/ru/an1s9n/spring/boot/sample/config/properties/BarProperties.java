package ru.an1s9n.spring.boot.sample.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("bar")
@ConstructorBinding
@Data
public class BarProperties {
  @DefaultValue("bar property one default value") private final String propertyOne; //value should be taken from application.yml
  @DefaultValue("bar property two default value") private final String propertyTwo; //default value should be taken
}
