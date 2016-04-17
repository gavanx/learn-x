// Code generated by dagger-compiler.  Do not edit.
package coffee;

import java.util.Set;

import javax.inject.Provider;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;

/**
 * A manager of modules and provides adapters allowing for proper linking and instance provision of types served by {@code @Provides} methods.
 */
public final class PumpModule$$ModuleAdapter extends ModuleAdapter<PumpModule> {
    private static final String[] INJECTS = {};
    private static final Class<?>[] STATIC_INJECTIONS = {};
    private static final Class<?>[] INCLUDES = {};

    public PumpModule$$ModuleAdapter() {
        super(coffee.PumpModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, true /*library*/);
    }

    @Override
    public PumpModule newModule() {
        return new coffee.PumpModule();
    }

    /**
     * Used internally obtain dependency information, such as for cyclical graph detection.
     */
    @Override
    public void getBindings(BindingsGroup bindings, PumpModule module) {
        bindings.contributeProvidesBinding("coffee.Pump", new ProvidePumpProvidesAdapter(module));
    }

    /**
     * A {@code Binding<coffee.Pump>} implementation which satisfies Dagger's infrastructure requirements including:
     *
     * Owning the dependency links between {@code coffee.Pump} and its dependencies.
     *
     * Being a {@code Provider<coffee.Pump>} and handling creation and preparation of object instances.
     */
    public static final class ProvidePumpProvidesAdapter extends ProvidesBinding<Pump> implements Provider<Pump> {
        private final PumpModule module;
        private Binding<Thermosiphon> pump;

        public ProvidePumpProvidesAdapter(PumpModule module) {
            super("coffee.Pump", NOT_SINGLETON, "coffee.PumpModule", "providePump");
            this.module = module;
            setLibrary(true);
        }

        /**
         * Used internally to link bindings/providers together at run time according to their dependency graph.
         */
        @Override
        @SuppressWarnings("unchecked")
        public void attach(Linker linker) {
            pump = (Binding<Thermosiphon>) linker.requestBinding("coffee.Thermosiphon", PumpModule.class, getClass().getClassLoader());
        }

        /**
         * Used internally obtain dependency information, such as for cyclical graph detection.
         */
        @Override
        public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
            getBindings.add(pump);
        }

        /**
         * Returns the fully provisioned instance satisfying the contract for {@code Provider<coffee.Pump>}.
         */
        @Override
        public Pump get() {
            return module.providePump(pump.get());
        }
    }
}
