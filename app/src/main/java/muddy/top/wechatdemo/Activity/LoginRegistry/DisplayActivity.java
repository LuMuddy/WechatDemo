package muddy.top.wechatdemo.Activity.LoginRegistry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import muddy.top.wechatdemo.Activity.Welcome.LanguageSettingActivity;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class DisplayActivity extends BaseActivity implements View.OnClickListener {
    private Button bt_login,bt_registry,bt_language;

    public static DisplayActivity instance = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initView();
        instance = this;
    }

    private void initView() {
        bt_login=(Button)findViewById(R.id.bt_login);
        bt_registry=(Button)findViewById(R.id.bt_registry);
        bt_language=(Button)findViewById(R.id.bt_language);
        bt_language.setOnClickListener(this);
        bt_registry.setOnClickListener(this);
        bt_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login://登陆
                    startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.bt_registry://注册
                startActivity(new Intent(this,RegistryActivity.class));
                break;
            case R.id.bt_language://语言
                startActivity(new Intent(this, LanguageSettingActivity.class));
                break;

        }
    }

 }
