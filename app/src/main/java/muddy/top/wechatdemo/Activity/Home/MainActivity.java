package muddy.top.wechatdemo.Activity.Home;

import android.os.Bundle;
import android.widget.TextView;

import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class MainActivity extends BaseActivity {

    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {

        tv_test = (TextView) findViewById(R.id.tv_test);
    }
}
