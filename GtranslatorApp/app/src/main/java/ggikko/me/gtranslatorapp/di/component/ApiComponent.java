package ggikko.me.gtranslatorapp.di.component;

import dagger.Component;
import ggikko.me.gtranslatorapp.ui.MainActivity;
import ggikko.me.gtranslatorapp.di.module.ApiModule;
import ggikko.me.gtranslatorapp.di.qualifier.GgikkoScope;

/**
 * Created by admin on 16. 5. 25..
 */
@GgikkoScope
@Component(modules = ApiModule.class, dependencies = NetworkComponent.class)
public interface ApiComponent {

    void inject(MainActivity mainActivity);
}
