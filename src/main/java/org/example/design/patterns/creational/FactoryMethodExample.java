package org.example.design.patterns.creational;


/**
 * In a factory design pattern you do not have to initialize objects at the same time you are also not restricting the
 * child class to alter the type of the object.
 *
 * * @author Pratyay
 */
class FactoryMethodExample {
    public static void main(String[] args) {
        Logger applicationLogger = new ApplicationLogger();
        Logs applicationLogs = applicationLogger.createLog();
        applicationLogs.write();
    }
}

interface Logs {
    void write();
}

class ApplicationLogs implements Logs {

    @Override
    public void write() {
        System.out.println("writing application logs!");
    }
}

class ServerLogs implements Logs {

    @Override
    public void write() {
        System.out.println("writing server logs");
    }
}



abstract class Logger {
    abstract Logs createLog();
}

class ApplicationLogger extends Logger {

    @Override
    Logs createLog() {
        return new ApplicationLogs();
    }
}

class ServerLogger extends Logger {

    @Override
    Logs createLog() {
        return new ServerLogs();
    }
}
