package www.porcelanatosoasis.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView site;
    String mypage = "http://www.porcelanatosoasis.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        site = (WebView) findViewById(R.id.site);
        site.getSettings().setJavaScriptEnabled(true);
        site.setFocusable(true);
        site.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        site.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        site.getSettings().setDomStorageEnabled(true);
        site.getSettings().setDatabaseEnabled(true);
        site.getSettings().setAppCacheEnabled(true);
        site.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        site.loadUrl(mypage);
    }
}
