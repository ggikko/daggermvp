package ggikko.me.gtranslatorapp.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ggikko.me.gtranslatorapp.di.module.NetworkModule;
import retrofit2.Retrofit;

/**
 * Created by admin on 16. 5. 25..
 */

@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {

    Retrofit retrofit();
}
