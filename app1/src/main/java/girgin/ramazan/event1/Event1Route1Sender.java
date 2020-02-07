package girgin.ramazan.event1;

import girgin.ramazan.CustomEventsSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Event1Route1Sender {
    private final Logger LOGGER = LoggerFactory.getLogger(Event1Route1Sender.class);

    private final CustomEventsSource customEventsSource;

    public Event1Route1Sender(CustomEventsSource customEventsSource) {
        this.customEventsSource = customEventsSource;
    }

    @Scheduled(fixedRate = 5000, initialDelay = 5000)
    public void send() {
        Event1 event1 = new Event1();
        event1.setFilter("route-1");
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("route", "route-1");
        Message<Event1> event1Message = new GenericMessage<Event1>(event1, headers);
        customEventsSource.event1OutputChannel().send(event1Message);
        LOGGER.info("Sent Route -1 Event-1: {}", event1);
    }
}