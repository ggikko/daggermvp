package ggikko.me.gtranslatorapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.gtranslatorapp.GgikkoApp;
import ggikko.me.gtranslatorapp.R;
import ggikko.me.gtranslatorapp.model.TranslatedTextResponse;
import ggikko.me.gtranslatorapp.service.TranslateService;
import ggikko.me.gtranslatorapp.service.TranslateViewInterface;
import rx.Observable;

public class MainActivity extends AppCompatActivity implements TranslateViewInterface {

    @Inject TranslateService translateService;

    @BindView(R.id.result) TextView result;
    @BindView(R.id.input_box) EditText input_box;

    @OnClick(R.id.btn_translate)
    void callTranslate(){
            presenter.translate();
    }

    private TranslatePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((GgikkoApp)getApplication()).getApiComponent().inject(MainActivity.this);
        ButterKnife.bind(this);

        presenter = new TranslatePresenter(MainActivity.this);
        presenter.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(String message) {
    }

    @Override
    public void onTranslate(TranslatedTextResponse translatedTextResponse) {
        result.setText(translatedTextResponse.message.result.translatedText);
    }

    @Override
    public Observable<TranslatedTextResponse> getTranslatedString() {
        Log.e("ggikko","translate2");
        return translateService.translate();
    }

}
