package com.rabbit.springcloudstream.source.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Publisher;
import org.springframework.stereotype.Service;

import java.util.Date;


@Slf4j
@Service("sourcePublisherService")
public class SourcePublisherService {

	/*
		VERSION 5 (See SourceConfig.java) - Another Spring Integration style
		@Publisher publish the result to the channel and return it to the caller
	 */
	@Publisher(channel = Source.OUTPUT)
	public Long sendTimeMessage(final String ignoredInput) {

		log.debug("Ignored input: {}", ignoredInput);

		final long timestamp = new Date().getTime();
		log.info("Send: {}", timestamp);
		return timestamp;
	}

}
