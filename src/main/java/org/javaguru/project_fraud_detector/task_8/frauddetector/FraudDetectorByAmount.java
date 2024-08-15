package org.javaguru.project_fraud_detector.task_8.frauddetector;

public class FraudDetectorByAmount {

    private final int banAmount;

    public FraudDetectorByAmount(int banAmount) {
        this.banAmount = banAmount;
    }

    public boolean isFraud(Transaction transaction){
        return this.banAmount < transaction.getAmount();
    }
}
