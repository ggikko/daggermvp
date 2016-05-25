package ggikko.me.gtranslatorapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ggikko.me.gtranslatorapp.GgikkoApp;
import ggikko.me.gtranslatorapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((GgikkoApp)getApplication()).getApiComponent().inject(MainActivity.this);
    }
}
