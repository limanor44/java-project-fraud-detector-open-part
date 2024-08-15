package org.javaguru.project_fraud_detector.task_4.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudDetectorTest {

    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemonAndAmountLessThenAllowed() {
        Trader trader = new Trader("Jon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudTransactionFromOtherTraderThenPokemonButAmountMoreThenAllowed() {
        Trader trader = new Trader("Jon", "Rome");
        Transaction transaction = new Transaction(trader, 10000000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraudTransactionFromTraderThenPokemonAndAmountLessThenAllowed() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudTransactionFromOtherTraderThenPokemonAndNegativeAmount() {
        Trader trader = new Trader("Jon", "Rome");
        Transaction transaction = new Transaction(trader, -1);
        assertTrue(fraudDetector.isFraud(transaction));
    }
}