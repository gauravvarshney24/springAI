package com.gaurav.varshney.demo.Controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

    private final ChatClient chatClient;

    public AIController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/test")
    public String AISample(String prompt) {
        return chatClient.prompt().user("tell me about Manthan school").call().content();
    //return "gaurav";
    }

    @GetMapping("/test2")
    public String AISample2(String prompt) {
        //return chatClient.prompt().user("who si the PM of india").call().content();
        return "gaurav";
    }

    @GetMapping("/testPrompt")
    public String AISample3(String message) {

        //return chatClient.call(new Prompt("tell me a jock")).;
        return "gaurav";
    }

}
