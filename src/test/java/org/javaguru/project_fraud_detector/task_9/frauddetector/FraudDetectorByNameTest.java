package org.javaguru.project_fraud_detector.task_9.frauddetector;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FraudDetectorByNameTest {
    private FraudDetectorByName fraudDetectorByName = new FraudDetectorByName("Pokemon");

    @Test
    public void shouldReturnTrueWhereNamePokemon(){
        Transaction transaction = new Transaction(new Trader("Pokemon","Minsk", "Belarus"),1_000);
        assertTrue(fraudDetectorByName.isFraud(transaction));
    }

    @Test
    public void shouldReturnFalseWhereNameNotPokemon(){
        Transaction transaction = new Transaction(new Trader("Pokemon1","Minsk", "Belarus"),1_000);
        assertFalse(fraudDetectorByName.isFraud(transaction));
    }
}
