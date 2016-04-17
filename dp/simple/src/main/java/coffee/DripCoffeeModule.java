package coffee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = CoffeeApp.class,
        includes = PumpModule.class)
class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
