package com.rabbit.springcloudstream.sink.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration("sinkConfig")
@EnableBinding(Sink.class)
public class SinkConfig {

	@StreamListener(Sink.INPUT)
	public void loggerSink(final String date) {

		log.info("Received: {}", date);
	}

}
