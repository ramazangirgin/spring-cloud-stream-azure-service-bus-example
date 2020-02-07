package girgin.ramazan;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomEventsSource {

    @Output("event1OutputChannel")
    MessageChannel event1OutputChannel();
}
