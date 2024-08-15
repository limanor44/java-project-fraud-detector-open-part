package org.javaguru.project_fraud_detector.task_4.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        if (transaction != null && transaction.getTrader() != null && transaction.getTrader().getFullName() != null) {
            return transaction.getTrader().getFullName().equalsIgnoreCase("Pokemon")
                    || transaction.getAmount() > 1000000
                    || transaction.getAmount() <= 0;
        }
        return false;
    }

}
