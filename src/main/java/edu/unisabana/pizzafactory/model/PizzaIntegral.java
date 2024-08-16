public class PizzaIntegral extends Pizza {

    @Override
    public Amasar createAmasarPizza() {
        return new AmasarPizzaIntegral();
    }

    @Override
    public Hornear createHornearPizza() {
        return new HornearPizzaIntegral();
    }

    @Override
    public Moldear createMoldearPizza() {
        return new MoldearPizzaIntegral();
    }
}