package com.rabbit.springcloudstream.source.schedulers;

import com.rabbit.springcloudstream.source.services.SourcePublisherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Slf4j
@Service("sourceSchedulerService")
public class SourceSchedulerService {

	@Resource(name = "sourcePublisherService")
	SourcePublisherService sourcePublisherService;

	@Scheduled(fixedRate = 3000, initialDelay = 3000)
	public void sendTimeMessage() {

		final Long timestamp = sourcePublisherService.sendTimeMessage("IGNORED TEST INPUT FROM SCHEDULER...");
		log.info("TimeStamp returned: {}", timestamp);
	}

}
