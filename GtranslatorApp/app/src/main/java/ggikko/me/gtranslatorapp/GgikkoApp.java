package ggikko.me.gtranslatorapp;

import android.app.Application;
import android.net.Network;

import ggikko.me.gtranslatorapp.di.component.ApiComponent;
import ggikko.me.gtranslatorapp.di.component.DaggerApiComponent;
import ggikko.me.gtranslatorapp.di.component.DaggerNetworkComponent;
import ggikko.me.gtranslatorapp.di.component.NetworkComponent;
import ggikko.me.gtranslatorapp.di.module.NetworkModule;
import ggikko.me.gtranslatorapp.util.ConstantApi;
import lombok.Getter;

/**
 * Created by admin on 16. 5. 25..
 */
public class GgikkoApp extends Application {

    @Getter ApiComponent apiComponent;

    @Override
    public void onCreate() {
        dependency();
        super.onCreate();
    }

    private void dependency() {
        apiComponent = DaggerApiComponent.builder().networkComponent(getNetworkComponent()).build();
    }

    public NetworkComponent getNetworkComponent() {
        return DaggerNetworkComponent.builder().networkModule(new NetworkModule(ConstantApi.BASE_URL)).build();
    }
}
