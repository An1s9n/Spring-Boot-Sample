package ru.an1s9n.spring.boot.sample.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("foo")
public record FooProperties(
  @DefaultValue("foo property one default value") String propertyOne, //value should be taken from application.yml
  @DefaultValue("foo property two default value") String propertyTwo //default value should be taken
) {}
