package Actividades.A10_2_IPTables;

public class Test {
    public static void main(String[] args) {
        Server server = new Server();
        IPTables serverIPTables = server.getIPTables();
        serverIPTables.addRule("A", "192.168.0.1", "ACCEPT");
        serverIPTables.addRule("A", "192.168.0.2", "REJECT");
        serverIPTables.addRule("I", "192.168.0.3", "ACCEPT");
        serverIPTables.start();
        server.simulateNavigation("192.168.0.1", "www.site8.com");
        server.simulateNavigation("192.168.0.2", "www.site1.com");        
        serverIPTables.stop();
        server.simulateNavigation("192.168.0.1", "www.google.com");
    }

}