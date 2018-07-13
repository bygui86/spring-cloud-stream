package com.rabbit.springcloudstream.processor.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


@Slf4j
@Configuration("processorConfig")
@EnableBinding(Processor.class)
public class ProcessorConfig {

	@Transformer(
			inputChannel = Processor.INPUT,
			outputChannel = Processor.OUTPUT
	)
	public Object transform(final Long timestamp) {

		log.info("Transform: {}", timestamp);

		final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:yy");
		return dateFormat.format(timestamp);
	}

}
