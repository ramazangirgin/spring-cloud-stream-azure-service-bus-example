package girgin.ramazan.event1;

import girgin.ramazan.CustomEventsSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Event2Route2Sender {
    private final Logger LOGGER = LoggerFactory.getLogger(Event2Route2Sender.class);

    private final CustomEventsSource customEventsSource;

    public Event2Route2Sender(CustomEventsSource customEventsSource) {
        this.customEventsSource = customEventsSource;
    }

    @Scheduled(fixedRate = 5000, initialDelay = 5000)
    public void send() {
        Event2 event = new Event2();
        event.setFilter("route-2");
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("route", "route-2");
        Message<Event2> message = new GenericMessage<Event2>(event, headers);
        customEventsSource.event1OutputChannel().send(message);
        LOGGER.info("Sent Route -2 Event-2: {}", event);
    }
}