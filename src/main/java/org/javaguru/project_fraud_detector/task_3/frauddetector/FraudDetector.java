package org.javaguru.project_fraud_detector.task_3.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction != null && transaction.getTrader() != null && transaction.getTrader().getFullName() != null) {
            return transaction.getTrader().getFullName().equalsIgnoreCase("Pokemon");
        }
        return false;
    }
}
