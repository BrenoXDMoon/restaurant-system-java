package br.com.brenoxdmoon.restaurant_system.outbound.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository")
public class JpaConfiguration {
}
