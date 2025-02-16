package org.example.designs.patterns.creational;



/**
 * *
 * * @author Pratyay
 */

class BuilderPattern {

}

class DatabaseCredentials {

    private int port;
    private String username;
    private String host;
    private String password;

    private DatabaseCredentials databaseCredentials;

    private DatabaseCredentials() {
        databaseCredentials = new DatabaseCredentials();
    }

    public DatabaseCredentials setUsername(String username) {
        this.username = username;
        return databaseCredentials;
    }

    public DatabaseCredentials setHost(String host) {
        this.host = host;
        return databaseCredentials;
    }

    public DatabaseCredentials setPassword(String password) {
        this.password = password;
        return databaseCredentials;
    }

    public DatabaseCredentials setPort(int port){
        this.port = port;
        return databaseCredentials;
    }

    public DatabaseCredentials build() {
        return databaseCredentials;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
    }
}
