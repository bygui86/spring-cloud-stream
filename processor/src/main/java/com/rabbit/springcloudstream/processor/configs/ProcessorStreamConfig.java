package com.rabbit.springcloudstream.processor.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration("processorStreamConfig")
@EnableBinding(Processor.class)
public class ProcessorStreamConfig {

	// no-op
}
