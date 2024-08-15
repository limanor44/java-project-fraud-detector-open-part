package org.javaguru.project_fraud_detector.task_9.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FraudDetectorByCityTest {

    FraudDetectorByCity fraudDetectorByCity = new FraudDetectorByCity("Minsk");

    @Test
    public void shouldReturnTrueWhereCityMinsk(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Latvia"),1_000);
        assertTrue(fraudDetectorByCity.isFraud(transaction));
    }

    @Test
    public void shouldReturnTrueWhereCityNotMinsk(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Gomel", "Latvia"),1_000);
        assertFalse(fraudDetectorByCity.isFraud(transaction));
    }
}
