package org.example.designs.patterns.structural;


import lombok.RequiredArgsConstructor;

/**
 * *
 * * @author Pratyay
 */
class ProxyExample {
    public static void main(String[] args) {
        RPCRequestSender requestSender = new RPCRequestSender();
        RPCRequestProcessor requestProcessor = new RPCRequestProcessor();
        Proxy proxy = new Proxy(requestSender, requestProcessor);
        RPCClient client = new RPCClient(proxy);
        client.call();
    }
}

@RequiredArgsConstructor
class RPCClient {
    private final RequestProcessor requestProcessor;

    void call() {
       requestProcessor.processRequest();
    }
}

class RPCRequestSender {

    public String getSource() {
        return "";
    }
}

@RequiredArgsConstructor
class Proxy implements RequestProcessor {
    private final RPCRequestSender requestSender;
    private final RPCRequestProcessor requestProcessor;

    @Override
    public void processRequest() {
        authenticateAndProcessRequest();
    }

    private void authenticateAndProcessRequest() {
        if(requestSender.getSource().equals("")) {
            requestProcessor.processRequest();
        }
        throw new UnsupportedOperationException();
    }
}

interface RequestProcessor {
    void processRequest();
}

class RPCRequestProcessor implements RequestProcessor {

    @Override
    public void processRequest() {
        // business logic for processing RPC
    }
}
