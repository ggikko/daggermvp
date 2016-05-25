package ggikko.me.gtranslatorapp.service;


import ggikko.me.gtranslatorapp.model.Result;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by admin on 16. 5. 25..
 */
public interface TranslateService {

    @FormUrlEncoded
    @POST("v1/language/translate")
    Observable<Result> translate(@Field("source") String source, @Field("target") String target, @Field("text") String text);
}
