package org.johnpc.spring.websocket;

import lombok.Getter;
import lombok.Setter;
/**
 * @Created By JohnPC
 */


public class Greeting {
    @Getter @Setter
    private String content;

    public Greeting(String content) {
        this.content = content;
    }
}
