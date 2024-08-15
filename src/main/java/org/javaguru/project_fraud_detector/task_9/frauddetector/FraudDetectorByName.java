package org.javaguru.project_fraud_detector.task_9.frauddetector;


public class FraudDetectorByName implements FraudRule {

    private final String name;

    public FraudDetectorByName(String name) {
        this.name = name;
    }

    public boolean isFraud(Transaction transaction) {
        return this.name.equals(transaction.getTrader().getFullName());
    }
}
