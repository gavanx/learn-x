// Code generated by dagger-compiler.  Do not edit.
package coffee;

import javax.inject.Provider;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;

/**
 * A manager of modules and provides adapters allowing for proper linking and instance provision of types served by {@code @Provides} methods.
 */
public final class DripCoffeeModule$$ModuleAdapter extends ModuleAdapter<DripCoffeeModule> {
    private static final String[] INJECTS = {"members/coffee.CoffeeApp",};
    private static final Class<?>[] STATIC_INJECTIONS = {};
    private static final Class<?>[] INCLUDES = {coffee.PumpModule.class,};

    public DripCoffeeModule$$ModuleAdapter() {
        super(coffee.DripCoffeeModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
    }

    @Override
    public DripCoffeeModule newModule() {
        return new coffee.DripCoffeeModule();
    }

    /**
     * Used internally obtain dependency information, such as for cyclical graph detection.
     */
    @Override
    public void getBindings(BindingsGroup bindings, DripCoffeeModule module) {
        bindings.contributeProvidesBinding("coffee.Heater", new ProvideHeaterProvidesAdapter(module));
    }

    /**
     * A {@code Binding<coffee.Heater>} implementation which satisfies Dagger's infrastructure requirements including:
     *
     * Being a {@code Provider<coffee.Heater>} and handling creation and preparation of object instances.
     */
    public static final class ProvideHeaterProvidesAdapter extends ProvidesBinding<Heater> implements Provider<Heater> {
        private final DripCoffeeModule module;

        public ProvideHeaterProvidesAdapter(DripCoffeeModule module) {
            super("coffee.Heater", IS_SINGLETON, "coffee.DripCoffeeModule", "provideHeater");
            this.module = module;
            setLibrary(false);
        }

        /**
         * Returns the fully provisioned instance satisfying the contract for {@code Provider<coffee.Heater>}.
         */
        @Override
        public Heater get() {
            return module.provideHeater();
        }
    }
}
