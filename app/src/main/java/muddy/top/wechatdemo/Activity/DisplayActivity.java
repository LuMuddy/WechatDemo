package muddy.top.wechatdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class DisplayActivity extends BaseActivity implements View.OnClickListener {
    private Button bt_login,bt_registry,bt_language;
    private RelativeLayout rl_all;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch(msg.what)
            {
                case 1:
                    rl_all.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initView();
        handler.sendEmptyMessageDelayed(1,1000*2);
    }

    private void initView() {
        bt_login=(Button)findViewById(R.id.bt_login);
        bt_registry=(Button)findViewById(R.id.bt_registry);
        bt_language=(Button)findViewById(R.id.bt_language);
        rl_all=(RelativeLayout)findViewById(R.id.rl_all);
        bt_language.setOnClickListener(this);
        bt_registry.setOnClickListener(this);
        bt_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login://登陆

                break;
            case R.id.bt_registry://注册

                break;
            case R.id.bt_language://语言
                startActivity(new Intent(this,Language_setting.class));
                break;

        }
    }

 }
