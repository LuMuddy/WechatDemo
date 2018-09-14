package muddy.top.wechatdemo.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dou361.dialogui.DialogUIUtils;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.L;
import muddy.top.wechatdemo.View.showDialog;

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private TextView tv_login_static,tv_title,tv_city,tv_phone,tv_retrieve_password,emergency_freezing,wechat_security_enter;
    private Button bt_next;
    private EditText et_two,et_one;
    private ImageView iv_quit,iv_one_clear,iv_two_clear;
    private RelativeLayout rl_city;
    private boolean flag=true;//判断当前的登陆方式，默认为手机
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        rl_city=(RelativeLayout)findViewById(R.id.rl_city);
        tv_login_static=(TextView)findViewById(R.id.tv_login_static);
        tv_title=(TextView)findViewById(R.id.tv_title);
        tv_city=(TextView)findViewById(R.id.tv_city);
        iv_one_clear=(ImageView) findViewById(R.id.iv_one_clear);
        iv_two_clear=(ImageView) findViewById(R.id.iv_two_clear);
        iv_quit=(ImageView) findViewById(R.id.iv_quit);
        tv_phone=(TextView)findViewById(R.id.tv_phone);
        tv_retrieve_password=(TextView)findViewById(R.id.tv_retrieve_password);
        emergency_freezing=(TextView)findViewById(R.id.emergency_freezing);
        wechat_security_enter=(TextView)findViewById(R.id.wechat_security_enter);
        et_one=(EditText)findViewById(R.id.et_one) ;
        et_one.setEnabled(false);
        et_two=(EditText)findViewById(R.id.et_two) ;
        bt_next=(Button) findViewById(R.id.bt_next);
        rl_city.setOnClickListener(this);
        tv_login_static.setOnClickListener(this);
        bt_next.setOnClickListener(this);
        iv_quit.setOnClickListener(this);
        iv_one_clear.setOnClickListener(this);
        iv_two_clear.setOnClickListener(this);
        tv_retrieve_password.setOnClickListener(this);
        emergency_freezing.setOnClickListener(this);
        wechat_security_enter.setOnClickListener(this);
        bt_next.setEnabled(false);
        monitor();//文本框监听
    }

    private void monitor() {
        if (flag){//做手机号码登录的逻辑
            Log.e("login","做手机号码登录的逻辑");
            et_two.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (hasFocus){
                        if (!TextUtils.isEmpty(et_two.getText().toString())){
                            iv_two_clear.setVisibility(View.VISIBLE);
                        }else{
                            iv_two_clear.setVisibility(View.GONE);
                        }
                    }

                }
            });
            et_two.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // 输入内容之前你想做什么
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    // 输入的时候你想做什么
                    if (!(TextUtils.isEmpty(et_two.getText().toString()))) {
                        iv_two_clear.setVisibility(View.VISIBLE);
                    }else {
                        iv_two_clear.setVisibility(View.GONE);
                    }
                    if (!(TextUtils.isEmpty(et_two.getText().toString()))) {
                        bt_next.setEnabled(true);
                        bt_next.setBackgroundResource(R.drawable.bt_lime_shape);
                    } else {
                        bt_next.setBackgroundResource(R.drawable.bt_noclickable_shape);
                        bt_next.setEnabled(false);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                    // 输入之后你想做什么

                }
            });



        }else{//做QQ/微信登录的逻辑
            Log.e("login","做QQ/微信登录的逻辑");

            et_one.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {

                    if (hasFocus){
                        if (TextUtils.isEmpty(et_one.getText().toString())){
                            iv_one_clear.setVisibility(View.VISIBLE);
                        }
                    }else{
                        iv_one_clear.setVisibility(View.GONE);
                    }

                }
            });
            et_one.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // 输入内容之前你想做什么
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    // 输入的时候你想做什么
                    if (!(TextUtils.isEmpty(et_one.getText().toString()))) {
                        iv_one_clear.setVisibility(View.VISIBLE);
                    }else {
                        iv_one_clear.setVisibility(View.GONE);
                    }

                  if (!TextUtils.isEmpty(et_one.getText())&&!TextUtils.isEmpty(et_two.getText())) {
                    bt_next.setEnabled(true);
                     bt_next.setBackgroundResource(R.drawable.bt_lime_shape);
                    } else {
                     bt_next.setBackgroundResource(R.drawable.bt_noclickable_shape);
                     bt_next.setEnabled(false);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                    // 输入之后你想做什么

                }
            });

            et_two.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (hasFocus){
                        if (TextUtils.isEmpty(et_two.getText().toString())){
                            iv_two_clear.setVisibility(View.VISIBLE);
                        }
                    }else{
                        iv_two_clear.setVisibility(View.GONE);
                    }

                }
            });
            et_two.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // 输入内容之前你想做什么
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    // 输入的时候你想做什么
                    if (!(TextUtils.isEmpty(et_two.getText().toString()))) {
                        iv_two_clear.setVisibility(View.VISIBLE);
                    }else {
                        iv_two_clear.setVisibility(View.GONE);
                    }
                   if (!TextUtils.isEmpty(et_one.getText())&&!TextUtils.isEmpty(et_two.getText())) {
                    bt_next.setEnabled(true);
                     bt_next.setBackgroundResource(R.drawable.bt_lime_shape);
                   } else {
                      bt_next.setBackgroundResource(R.drawable.bt_noclickable_shape);
                      bt_next.setEnabled(false);
                   }
                }
                @Override
                public void afterTextChanged(Editable s) {
                    // 输入之后你想做什么

                }
            });
        }
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
                    et_one.setText(getString(R.string.cityphone));
                    et_one.setEnabled(false);
                    et_two.setText(null);
                    rl_city.setEnabled(false);
                    et_one.setTextColor(getResources().getColor(R.color.logincolor));
                    iv_one_clear.setVisibility(View.GONE);
                }else{
                    tv_city.setText(getString(R.string.Accountnumber));
                    bt_next.setText(getString(R.string.login));
                    tv_login_static.setText(getString(R.string.phonelogin));
                    tv_phone.setText(getString(R.string.pwd));
                    tv_title.setText(getString(R.string.loginstatic));
                    et_one.setText(null);
                    et_one.setHint(getString(R.string.pleaseloginstatic));
                    et_one.setEnabled(true);
                    et_two.setText(null);
                    rl_city.setEnabled(true);
                    et_one.setTextColor(getResources().getColor(R.color.black));
                }
                flag=!flag;
                monitor();
                break;
            case R.id.bt_next:
                dialog= DialogUIUtils.showLoading(this, "加载中...", false, true, true, true).show();
                    if (flag){//手机号码登陆
                        if (et_two.getText().length()<11){
                            dialog.dismiss();
                            showDialog.showAlerDialog(LoginActivity.this,false,"手机号码错误","你输入的是一个无效的手机号码");

                        }else{
                            //联网验证账号是否注册
                            Intent intent=new Intent();
                            intent.putExtra("Phone",et_two.getText().toString());
                            intent.setClass(this,MoblieLoginActivity.class);
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }else{//微信号QQ登陆
                        L.e("微信号QQ登陆");
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

            case R.id.iv_two_clear:
                et_two.setText(null);
                bt_next.setEnabled(false);
                iv_two_clear.setVisibility(View.GONE);// 隐藏
                 bt_next.setBackgroundResource(R.drawable.bt_noclickable_shape);
                break;
            case R.id.iv_one_clear:
                et_one.setText(null);
                bt_next.setEnabled(false);
                iv_one_clear.setVisibility(View.GONE);// 隐藏
                 bt_next.setBackgroundResource(R.drawable.bt_noclickable_shape);
                break;
            case R.id.rl_city://选择国家

                break;

        }
    }


}
