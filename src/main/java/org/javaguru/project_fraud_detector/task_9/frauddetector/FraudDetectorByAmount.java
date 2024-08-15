package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class FraudDetectorByAmount implements FraudRule {

    private final int banAmount;

    public FraudDetectorByAmount(int banAmount) {
        this.banAmount = banAmount;
    }

    public boolean isFraud(Transaction transaction) {
        return this.banAmount < transaction.getAmount();
    }
}
