package com.tramy.sync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by honway on 2016/9/27.
 */
@RestController
public class KafkaController {

    @Autowired
    private MessageChannel messageChannel;

    @Autowired
    @Qualifier("received")
    private PollableChannel pollableChannel;

    @RequestMapping(value = "kafka")
    public Map<String, String> test() {
        Map<String, String> result = new HashMap<>();
        result.put("test", "kafka ok.");
        messageChannel.send(new GenericMessage<>("hello kafka!"));
        Message<?> receive = pollableChannel.receive(10000);
        if (receive != null) {
            System.out.println(receive);
        }
        return result;
    }
}
