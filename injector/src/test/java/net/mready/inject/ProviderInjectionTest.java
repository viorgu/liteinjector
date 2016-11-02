package net.mready.inject;

import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Provider;

import static org.junit.Assert.assertNotNull;

public class ProviderInjectionTest {
    @Test
    public void providerInjected() {
        Injector injector = Injector.with();
        assertNotNull(injector.instance(A.class).plainProvider.get());
    }

    public static class A {
        private final Provider<B> plainProvider;

        @Inject
        public A(Provider<B> plainProvider) {
            this.plainProvider = plainProvider;
        }
    }

    public static class B {

    }
}