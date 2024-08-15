package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class FraudDetectorByCity implements FraudRule {

    private final String banCity;

    public FraudDetectorByCity(String banCity) {
        this.banCity = banCity;
    }

    public boolean isFraud(Transaction transaction) {
        return this.banCity.equalsIgnoreCase(transaction.getTrader().getCity());
    }
}
