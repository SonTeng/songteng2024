package com.song.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "pattern")
public class PatternPropertiesConfig {
    private String dateformat;
}
