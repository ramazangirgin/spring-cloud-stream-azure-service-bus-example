package girgin.ramazan.event1;

import girgin.ramazan.CustomEventsSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class Event1Microservice2Listener1 {
    private final Logger LOGGER = LoggerFactory.getLogger(Event1Microservice2Listener1.class);

    @StreamListener(CustomEventsSource.EVENT_1_INPUT_MICROSERVICE2_CHANNEL)
    public void onEvent(Event1 event1) {
        LOGGER.info("Event1Microservice2Listener1->Received Event-1: {}", event1);
    }
}