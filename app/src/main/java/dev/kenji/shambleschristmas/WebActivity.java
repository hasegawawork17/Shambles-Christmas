package dev.kenji.shambleschristmas;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {
    SharedPreferences MyPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        MyPrefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        GameGlobalWebSetting webApp = findViewById(R.id.webApp);
        webApp.addJavascriptInterface(new JSScript(this), "jsBridge");
        webApp.loadUrl(MyPrefs.getString("gameURL", ""));
    }
}