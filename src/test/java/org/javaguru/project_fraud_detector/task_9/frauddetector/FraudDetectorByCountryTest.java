package org.javaguru.project_fraud_detector.task_9.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FraudDetectorByCountryTest {

    private FraudDetectorByCountry fraudDetectorByCountry = new FraudDetectorByCountry("Latvia");

    @Test
    public void shouldReturnTrueWhereCountryLatvia(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Latvia"),1_000);
        assertTrue(fraudDetectorByCountry.isFraud(transaction));
    }

    @Test
    public void shouldReturnFalseWhereCountryNotLatvia(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Belarus"),1_000);
        assertFalse(fraudDetectorByCountry.isFraud(transaction));
    }
}
