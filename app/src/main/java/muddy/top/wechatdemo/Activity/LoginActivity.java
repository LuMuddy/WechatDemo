package muddy.top.wechatdemo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import muddy.top.wechatdemo.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_login_static,tv_title,tv_city,tv_phone,tv_retrieve_password,emergency_freezing,wechat_security_enter;
    private Button bt_next;
    private EditText Et_Original_Pwd;
    private ImageView iv_quit;
    private boolean flag=true;//判断当前的登陆方式，默认为手机
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        tv_login_static=(TextView)findViewById(R.id.tv_login_static);
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_city=(TextView)findViewById(R.id.tv_city);
        iv_quit=(ImageView) findViewById(R.id.iv_quit);
        tv_phone=(TextView)findViewById(R.id.tv_phone);
        tv_retrieve_password=(TextView)findViewById(R.id.tv_retrieve_password);
        emergency_freezing=(TextView)findViewById(R.id.emergency_freezing);
        wechat_security_enter=(TextView)findViewById(R.id.wechat_security_enter);
        Et_Original_Pwd=(EditText)findViewById(R.id.Et_Original_Pwd) ;
        Et_Original_Pwd.setEnabled(false);
        bt_next=(Button) findViewById(R.id.bt_next);
        tv_login_static.setOnClickListener(this);
        bt_next.setOnClickListener(this);
        iv_quit.setOnClickListener(this);
        tv_retrieve_password.setOnClickListener(this);
        emergency_freezing.setOnClickListener(this);
        wechat_security_enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_login_static:
                if (!flag){
                    tv_title.setText(getString(R.string.phonelogin));
                    tv_city.setText(getString(R.string.citytext));
                    bt_next.setText(getString(R.string.next));
                    tv_login_static.setText(getString(R.string.loginStatic));
                    tv_phone.setText(getString(R.string.phone));
                    Et_Original_Pwd.setText(getString(R.string.cityphone));
                    Et_Original_Pwd.setEnabled(false);
                }else{
                    tv_city.setText(getString(R.string.Accountnumber));
                    bt_next.setText(getString(R.string.login));
                    tv_login_static.setText(getString(R.string.phonelogin));
                    tv_phone.setText(getString(R.string.pwd));
                    tv_title.setText(getString(R.string.loginstatic));
                    Et_Original_Pwd.setText(null);
                    Et_Original_Pwd.setHint(getString(R.string.pleaseloginstatic));
                    Et_Original_Pwd.setEnabled(true);
                }
                flag=!flag;
                break;
            case R.id.bt_next:
                    if (flag){//手机号码登陆

                    }else{//微信号QQ登陆

                    }
                break;
            case R.id.iv_quit:
                finish();
                break;
            case R.id.tv_retrieve_password:
                Intent intent=new Intent();
                intent.putExtra("url","https://www.baid.com");
                intent.setClass(this,WebIntentactivity.class);
                startActivity(intent);
                    break;
            case R.id.emergency_freezing:
                Intent intent1=new Intent();
                intent1.putExtra("url","https:/www.360.com");
                intent1.setClass(this,WebIntentactivity.class);
                startActivity(intent1);
                break;
            case R.id.wechat_security_enter:
                Intent intent2=new Intent();
                intent2.putExtra("url","https:/www.google.com");
                intent2.setClass(this,WebIntentactivity.class);
                startActivity(intent2);
                break;

        }
    }
}
