package com.rabbit.springcloudstream.source.configs;

import lombok.extern.slf4j.Slf4j;


@Slf4j
// @Configuration("sourceConfig")
@Deprecated
public class SourceConfig {

	/*
		VERSION 1 - Spring Integration style
		WORKING
	 */
	// @Bean
	// @InboundChannelAdapter(
	// 		value = Source.OUTPUT,
	// 		poller = @Poller(
	// 				fixedDelay = "3000",
	// 				maxMessagesPerPoll = "1"
	// 		)
	// )
	// public MessageSource<Long> creatTimeMessageSource() {
	//
	// 	return () -> {
	// 		final long timestamp = new Date().getTime();
	// 		log.info("Send: {}", timestamp);
	// 		return MessageBuilder.withPayload(timestamp).build();
	// 	};
	// }

	/*
		VERSION 2 - Spring Cloud Stream style
		NOT WORKING
	 */
	// @ServiceActivator(outputChannel = Source.OUTPUT)
	// @SendTo(Source.OUTPUT)
	// @Scheduled(fixedRate = 3000, initialDelay = 3000)
	// public Long loggerSink() {
	//
	// 	final long timestamp = new Date().getTime();
	// 	log.info("Send: {}", timestamp);
	// 	return timestamp;
	// }

	/*
		VERSION 3 - Pure Spring style
		WORKING
	 */
	// @Autowired
	// private Source source;
	//
	// @Scheduled(fixedRate = 3000, initialDelay = 3000)
	// public void sendTimeMessage() {
	//
	// 	final long timestamp = new Date().getTime();
	// 	log.info("Send: {}", timestamp);
	// 	source.output().send(
	// 			MessageBuilder.withPayload(timestamp).build()
	// 	);
	// }

	/*
		VERSION 4 - Alternative style
		NOT WORKING
	 */
	// @Scheduled(fixedRate = 3000, initialDelay = 3000)
	// @Output(Source.OUTPUT)
	// public Long sendTimeMessage() {
	//
	// 	final long timestamp = new Date().getTime();
	// 	log.info("Send: {}", timestamp);
	// 	return timestamp;
	// }

	/*
		VERSION 5 - Another Spring Integration style
		WORKING
	 */
	// @Scheduled(fixedRate = 3000, initialDelay = 3000)
	// @Publisher(channel = Source.OUTPUT) // publish the result to the channel and return it to the caller
	// public Long sendTimeMessage() {
	//
	// 	final long timestamp = new Date().getTime();
	// 	log.info("Send: {}", timestamp);
	// 	return timestamp;
	// }

}
