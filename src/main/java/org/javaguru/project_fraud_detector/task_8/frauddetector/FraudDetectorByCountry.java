package org.javaguru.project_fraud_detector.task_8.frauddetector;

public class FraudDetectorByCountry {

    private final String banCountry;

    public FraudDetectorByCountry(String banCountry) {
        this.banCountry = banCountry;
    }

    public boolean isFraud(Transaction transaction){
        return this.banCountry.equals(transaction.getTrader().getCountry());
    }
}
