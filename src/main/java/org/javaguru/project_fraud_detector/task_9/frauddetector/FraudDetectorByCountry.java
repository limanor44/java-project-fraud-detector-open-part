package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class FraudDetectorByCountry implements FraudRule {

    private final String banCountry;

    public FraudDetectorByCountry(String banCountry) {
        this.banCountry = banCountry;
    }

    public boolean isFraud(Transaction transaction) {
        return this.banCountry.equals(transaction.getTrader().getCountry());
    }
}
