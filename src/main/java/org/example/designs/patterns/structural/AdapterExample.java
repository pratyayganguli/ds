package org.example.designs.patterns.structural;


import lombok.RequiredArgsConstructor;

import java.util.Map;

/**
 * *
 * * @author Pratyay
 */
class AdapterExample {
    public static void main(String[] args) {
        Responder responder = new JsonResponder();
        Receiver receiver = new Adapter();
        Client client = new Client(responder, receiver);
        client.execute();
    }
}

@RequiredArgsConstructor
class Client {
    private final Responder responder;
    private final Receiver receiver;

    public void execute() {
        Map<String, Object> jsonData = responder.respond();
        receiver.receive(jsonData);
    }
}

interface Responder {
    Map<String, Object> respond();
}

class JsonResponder implements Responder {

    @Override
    public Map<String, Object> respond() {
        // complete the business logic over here.
        return Map.of();
    }
}

interface Receiver {
    void receive(Map<String, Object> data);
}

class Adapter implements Receiver {

    @Override
    public void receive(Map<String, Object> data) {
        String plainText = transformToPlainString(data);
        receive(plainText);
    }

    private void receive(String plainText) {
        // business logic over here.
    }

    private String transformToPlainString(Map<String, Object> data) {
        // business logic goes here.
        return "";
    }
}
