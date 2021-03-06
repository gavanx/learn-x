// Code generated by dagger-compiler.  Do not edit.
package coffee;

import java.util.Set;

import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;

/**
 * A {@code Binding<CoffeeApp>} implementation which satisfies Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code CoffeeApp} and its dependencies.
 *
 * Being a {@code Provider<CoffeeApp>} and handling creation and preparation of object instances.
 *
 * Being a {@code MembersInjector<CoffeeApp>} and handling injection of annotated fields.
 */
public final class CoffeeApp$$InjectAdapter extends Binding<CoffeeApp> implements Provider<CoffeeApp>, MembersInjector<CoffeeApp> {
    private Binding<CoffeeMaker> coffeeMaker;

    public CoffeeApp$$InjectAdapter() {
        super("coffee.CoffeeApp", "members/coffee.CoffeeApp", NOT_SINGLETON, CoffeeApp.class);
    }

    /**
     * Used internally to link bindings/providers together at run time according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
        coffeeMaker = (Binding<CoffeeMaker>) linker.requestBinding("coffee.CoffeeMaker", CoffeeApp.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
        injectMembersBindings.add(coffeeMaker);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for {@code Provider<CoffeeApp>}.
     */
    @Override
    public CoffeeApp get() {
        CoffeeApp result = new CoffeeApp();
        injectMembers(result);
        return result;
    }

    /**
     * Injects any {@code @Inject} annotated fields in the given instance, satisfying the contract for {@code Provider<CoffeeApp>}.
     */
    @Override
    public void injectMembers(CoffeeApp object) {
        object.coffeeMaker = coffeeMaker.get();
    }

}
