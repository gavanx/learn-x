package coffee;

import dagger.ObjectGraph;

public class Demo {

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(DripCoffeeModule.class);
        CoffeeApp coffeeApp = new CoffeeApp();
        objectGraph.inject(coffeeApp);
        coffeeApp.run();
    }

    public static void main1(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(DripCoffeeModule.class);
        CoffeeApp coffeeApp = objectGraph.get(CoffeeApp.class);
        coffeeApp.run();
    }
}
