package com.org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by shipra on 4/1/18.
 */
@Configuration
@ComponentScan("com.org.service")
public class RootConfig {
}