package org.javaguru.project_fraud_detector.task_9.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FraudDetectorByAmountTest {

    private FraudDetectorByAmount fraudDetectorByAmount = new FraudDetectorByAmount(1_000);

    @Test
    public void shouldReturnTrueWhereAmountMore1_000(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Latvia"),1_001);
        assertTrue(fraudDetectorByAmount.isFraud(transaction));
    }

    @Test
    public void shouldReturnTrueWhereAmountLess1_000(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Latvia"),0);
        assertFalse(fraudDetectorByAmount.isFraud(transaction));
    }

    @Test
    public void shouldReturnTrueWhereAmountEquals1_000(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Latvia"),1_000);
        assertFalse(fraudDetectorByAmount.isFraud(transaction));
    }
}
