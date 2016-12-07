package com.ononeleg.services;

/**
 * Created by ilya on 07/12/2016.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ononeleg.beans.Offer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {


    @Autowired
    MainService mainService;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "0 * 5,* * * *")
    public void getApiUpdate() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        mainService.saveAll(UtilsApi.getUpdatedOffers());

    }
}
