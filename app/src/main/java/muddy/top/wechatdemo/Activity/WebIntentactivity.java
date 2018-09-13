package muddy.top.wechatdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class WebIntentactivity extends BaseActivity implements View.OnClickListener {
    private WebView web_view;
    private ImageView iv_back;
    String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_intentactivity);
        Intent intent=getIntent();
        url=intent.getStringExtra("url");
        initView();
    }

    private void initView() {
        web_view = (WebView) findViewById(R.id.web_view);
        iv_back=(ImageView)findViewById(R.id.iv_back);
        iv_back.setOnClickListener(this);
        // 设置WebView的客户端
        web_view.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;// 返回false
            }
        });
        web_view.loadUrl(url);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                finish();
                break;

        }
    }
}
