package ggikko.me.gtranslatorapp.ui;

import ggikko.me.gtranslatorapp.base.BasePresenter;
import ggikko.me.gtranslatorapp.model.TranslatedTextResponse;
import ggikko.me.gtranslatorapp.service.TranslateViewInterface;
import rx.Observer;

/**
 * Created by admin on 16. 5. 25..
 */
public class TranslatePresenter extends BasePresenter implements Observer<TranslatedTextResponse> {

    private TranslateViewInterface translateViewInterface;

    public TranslatePresenter(TranslateViewInterface translateViewInterface) {
        this.translateViewInterface = translateViewInterface;
    }


    @Override
    public void onCompleted() {
        translateViewInterface.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
        translateViewInterface.onError(e.getMessage());
    }

    @Override
    public void onNext(TranslatedTextResponse translatedTextResponse) {
        translateViewInterface.onTranslate(translatedTextResponse );
    }

    public void translate(){
        unSubscribeAll();
        subscribe(translateViewInterface.getTranslatedString(), TranslatePresenter.this);
    }
}
