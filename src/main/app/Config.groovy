package app

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.*
import org.springframework.stereotype.Component

@Component
public class Config {
  @Value('${name:World}')
  private String name

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer()
  }
} // Config
