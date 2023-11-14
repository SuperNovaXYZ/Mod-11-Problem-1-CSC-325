package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PowerAdapterClient {
    public static void main(String[] args) {
        // Using the American power plug directly
        AmericanPowerPlug americanPlug = new AmericanPowerPlug();
        americanPlug.plugIn();

        // Using the adapter to plug into a European power socket
        EuropeanPowerSocket europeanSocket = new AmericanToEuropeanAdapter(americanPlug);
        europeanSocket.plugIntoEuropeanSocket();
    }
}