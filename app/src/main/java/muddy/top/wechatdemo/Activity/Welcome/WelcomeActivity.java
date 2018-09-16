package muddy.top.wechatdemo.Activity.Welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;

import muddy.top.wechatdemo.Activity.Home.MainActivity;
import muddy.top.wechatdemo.Activity.LoginRegistry.DisplayActivity;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.ShareUtils;

public class WelcomeActivity extends BaseActivity {

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch(msg.what)
            {
                case 1:
                    //去掉启动Activity的动画效果
                    Intent intent;
                    if (ShareUtils.getBoolean(WelcomeActivity.this,"Login_Static",false)){
                        intent=new  Intent(WelcomeActivity.this, MainActivity.class);
                    }else{
                      intent=new  Intent(WelcomeActivity.this, DisplayActivity.class);
                    }
                    WelcomeActivity.this.startActivity(intent);
                    ((Activity) WelcomeActivity.this).overridePendingTransition(0, 0);
                    finish();
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
        setContentView(R.layout.activity_welcome);
        handler.sendEmptyMessageDelayed(1,1000*3);
    }
}
