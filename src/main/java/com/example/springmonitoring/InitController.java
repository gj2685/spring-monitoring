package com.example.springmonitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class InitController {

    private String visitorCount;
    private String timerExample;
    private String gaugeExample;
    private String histogramExample;

    @GetMapping("/visitApi")
    public String visitorCount() {
        return visitorCount;
    }

    @GetMapping("/getResponseTime")
    public String timerExample() throws InterruptedException {
        return timerExample;
    }

    @GetMapping("/getQueueSize")
    public String gaugeExample() {
        return gaugeExample;
    }


    @GetMapping("/histogram")
    public String histogramExample() throws InterruptedException {
        return histogramExample;
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
