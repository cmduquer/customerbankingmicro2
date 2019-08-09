package com.microservicios2.clase2.customer.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservicios2.clase2.customer.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
