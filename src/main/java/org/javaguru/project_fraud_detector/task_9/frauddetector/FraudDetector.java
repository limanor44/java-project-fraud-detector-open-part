package org.javaguru.project_fraud_detector.task_9.frauddetector;

class FraudDetector implements FraudRule{

    private final FraudDetectorByAmount AmountMore1_000_000 = new FraudDetectorByAmount(1_000_000);
    private final FraudDetectorByAmount AmountMore1_000 = new FraudDetectorByAmount(1_000);
    private final FraudDetectorByCity SydneyCity = new FraudDetectorByCity("Sydney");
    private final FraudDetectorByCountry JamaicaCountry = new FraudDetectorByCountry("Jamaica");
    private final FraudDetectorByCountry GermanyCountry = new FraudDetectorByCountry("Germany");
    private final FraudDetectorByName PokemonName = new FraudDetectorByName("Pokemon");


    public boolean isFraud(Transaction transaction) {
        return PokemonName.isFraud(transaction)
                || AmountMore1_000_000.isFraud(transaction)
                || (AmountMore1_000.isFraud(transaction) && GermanyCountry.isFraud(transaction))
                || SydneyCity.isFraud(transaction)
                || JamaicaCountry.isFraud(transaction);
    }

}
