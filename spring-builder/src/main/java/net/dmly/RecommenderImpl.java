package net.dmly;

@Singleton
@Deprecated
public class RecommenderImpl implements Recommender {

    @InjectProperty("wisky")
    private String alcohol;

    public RecommenderImpl() {
        System.out.println("RecommenderImpl was created");
    }

    @Override
    public void recommend() {
        System.out.println("Drink " + alcohol);
    }
}
