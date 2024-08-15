package org.javaguru.project_fraud_detector.task_8.frauddetector;

public class FraudDetectorByCity {

    private final String banCity;

    public FraudDetectorByCity(String banCity) {
        this.banCity = banCity;
    }

    public boolean isFraud(Transaction transaction){
        return this.banCity.equalsIgnoreCase(transaction.getTrader().getCity());
    }
}
