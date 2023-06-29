package com.example.home_microservice;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import com.google.common.eventbus.AllowConcurrentEvents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dto {
    private String productName;
    private Long count;}
