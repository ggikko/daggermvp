package ggikko.me.gtranslatorapp.service;


import ggikko.me.gtranslatorapp.model.Result;
import ggikko.me.gtranslatorapp.model.TranslatedTextResponse;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by admin on 16. 5. 25..
 */
public interface TranslateService {

//    @Headers({
//            "Host: openapi.naver.com",
//            "Accept: */*",
//            "X-Naver-Client-Id : hCh1RB6l31fbKNmOXjRr",
//            "X-Naver-Client-Secret : obxUtFxrRE"
//    })

    @FormUrlEncoded
    @POST("v1/language/translate")
    Observable<TranslatedTextResponse> translate(@Header("X-Naver-Client-Id") String id,@Header("X-Naver-Client-Secret") String secret, @Field("source") String source, @Field("target") String target, @Field("text") String text);
}
