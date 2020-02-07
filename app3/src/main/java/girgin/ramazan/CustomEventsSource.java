package girgin.ramazan;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface CustomEventsSource {

    String EVENT_1_INPUT_MICROSERVICE2_CHANNEL = "event1InputChannel";
    @Input(EVENT_1_INPUT_MICROSERVICE2_CHANNEL)
    SubscribableChannel event1InputChannel();

}
