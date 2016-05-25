package ggikko.me.gtranslatorapp.di.module;

import dagger.Module;
import dagger.Provides;
import ggikko.me.gtranslatorapp.di.qualifier.GgikkoScope;
import ggikko.me.gtranslatorapp.service.TranslateService;
import retrofit2.Retrofit;


/**
 * Created by admin on 16. 5. 25..
 */

@Module
public class ApiModule {

    @Provides
    @GgikkoScope
    TranslateService provideTranslateService(Retrofit retrofit){
        return retrofit.create(TranslateService.class);
    }


}
