package org.javaguru.project_fraud_detector.task_5.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (transaction.getAmount() > 1000000) {
            return true;
        }

        if (trader.getCity().equalsIgnoreCase("Сидней")) {
            return true;
        }

        return false;
    }

}
