package org.javaguru.project_fraud_detector.task_8.frauddetector;

public class FraudDetectorByName {

    private final String name;

    public FraudDetectorByName(String name) {
        this.name = name;
    }

    public boolean isFraud(Transaction transaction) {
        return this.name.equals(transaction.getTrader().getFullName());
    }
}
