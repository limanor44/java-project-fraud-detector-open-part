package org.javaguru.project_fraud_detector.task_3.frauddetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();
    @Test
    public void shouldBeReturnTrueForTraderWithNamePokemon() {
        Trader trader = new Trader("Pokemon", "Minsk");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeReturnTrueForTraderWithLowerCaseNamePokemon() {
        Trader trader = new Trader("pokemon", "Minsk");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeReturnTrueForTraderWithUpperCaseNamePokemon() {
        Trader trader = new Trader("POKEMON", "Minsk");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeReturnFalseForTraderWithNameNotPokemon() {
        Trader trader = new Trader("Mike", "Moscow");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeReturnFalseForTraderWithNameEqualsNull() {
        Trader trader = new Trader(null, "Minsk");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeReturnFalseForTraderEqualsNull() {
        Transaction transaction = new Transaction(null, 100);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeReturnFalseForTransactionEqualsNull() {
        Transaction transaction = null;
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
