package ggikko.me.gtranslatorapp.service;

import ggikko.me.gtranslatorapp.model.TranslatedTextResponse;
import rx.Observable;

/**
 * Created by admin on 16. 5. 25..
 */
public interface TranslateViewInterface {
    void onCompleted();

    void onError(String message);

    void onTranslate(TranslatedTextResponse translatedTextResponse);

    Observable<TranslatedTextResponse> getTranslatedString();
}
