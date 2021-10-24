package net.dmly;

public class RecommenderImpl implements Recommender {

    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("Drink " + alcohol);
    }
}
