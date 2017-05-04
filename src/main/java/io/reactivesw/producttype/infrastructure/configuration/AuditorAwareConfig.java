package io.reactivesw.producttype.infrastructure.configuration;

import io.reactivesw.producttype.infrastructure.util.ZonedDateTimeAuditorAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Configuration for auditorAware.
 */
@Configuration
@EnableJpaAuditing
public class AuditorAwareConfig {
  /**
   * Auditor provider zoned date time auditor aware.
   *
   * @return the zoned date time auditor aware
   */
  @Bean
  public ZonedDateTimeAuditorAware auditorProvider() {
    return new ZonedDateTimeAuditorAware();
  }
}