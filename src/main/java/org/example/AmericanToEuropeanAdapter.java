package org.example;

class AmericanToEuropeanAdapter implements EuropeanPowerSocket {
    private AmericanPowerPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPowerPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugIntoEuropeanSocket() {
        americanPlug.plugIn();
        System.out.println("Adapter converts to fit European power socket");
    }
}
