package muddy.top.wechatdemo.Activity.LoginRegistry;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.listener.DialogUIListener;
import muddy.top.wechatdemo.Activity.Home.MainActivity;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.ShareUtils;
import muddy.top.wechatdemo.View.showDialog;

import static com.dou361.dialogui.DialogUIUtils.showToast;
import static muddy.top.wechatdemo.Activity.LoginRegistry.DisplayActivity.instance;

public class MoblieLoginActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_quit;
    private RelativeLayout ril_head;
    private TextView tv_title;
    private TextView tv_city;
    private TextView tv_one;
    private ImageView iv_one_clear;
    private RelativeLayout rl_city;
    private RelativeLayout RlL_Original_Pwd;
    private TextView tv_phone;
    private EditText et_two;
    private ImageView iv_two_clear;
    private LinearLayout Ll_Middle;
    private TextView tv_login_static;
    private Button bt_next;
    private TextView tv_retrieve_password;
    private TextView emergency_freezing;
    private TextView wechat_security_enter;
    private String Phone;
    private Button bt_yzm;
    private boolean flag=true;//判断当前的登陆方式，默认为密码登陆
    private boolean sms=false;//判断验证码是否发生过
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moblie_login);
        initView();
        Intent intent=getIntent();
        Phone=intent.getStringExtra("Phone");
        tv_one.setText(Phone);
    }

    private void initView() {
        bt_yzm=(Button)findViewById(R.id.bt_yzm);
        iv_quit = (ImageView) findViewById(R.id.iv_quit);
        ril_head = (RelativeLayout) findViewById(R.id.ril_head);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_city = (TextView) findViewById(R.id.tv_city);
        tv_one = (TextView) findViewById(R.id.tv_one);
        iv_one_clear = (ImageView) findViewById(R.id.iv_one_clear);
        rl_city = (RelativeLayout) findViewById(R.id.rl_city);
        RlL_Original_Pwd = (RelativeLayout) findViewById(R.id.RlL_Original_Pwd);
        tv_phone = (TextView) findViewById(R.id.tv_phone);
        et_two = (EditText) findViewById(R.id.et_two);
        iv_two_clear = (ImageView) findViewById(R.id.iv_two_clear);
        Ll_Middle = (LinearLayout) findViewById(R.id.Ll_Middle);
        tv_login_static = (TextView) findViewById(R.id.tv_login_static);
        bt_next = (Button) findViewById(R.id.bt_next);
        tv_retrieve_password = (TextView) findViewById(R.id.tv_retrieve_password);
        emergency_freezing = (TextView) findViewById(R.id.emergency_freezing);
        wechat_security_enter = (TextView) findViewById(R.id.wechat_security_enter);
        bt_yzm.setOnClickListener(this);
        bt_next.setOnClickListener(this);
        tv_login_static.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_login_static:
                //改变登陆方式
                if (!flag){
                    tv_phone.setText(getString(R.string.pwd));
                    tv_login_static.setText(getString(R.string.pwdStatic));
                    bt_yzm.setVisibility(View.GONE);
                    et_two.setHint(getString(R.string.pleastwechatpwd));
                }else{
                    tv_phone.setText(getString(R.string.yzm));
                    tv_login_static.setText(getString(R.string.smsStatic));
                    bt_yzm.setVisibility(View.VISIBLE);
                    et_two.setHint(getString(R.string.inputyzm));
                }
                flag=!flag;
                break;
            case R.id.bt_next:
                submit();
                break;
            case R.id.bt_yzm:
                DialogUIUtils.showMdAlert(MoblieLoginActivity.this, "确认手机号码","我们将发送验证码短信到下面的号码："+"\n"+tv_one.getText().toString(), new DialogUIListener() {
                    @Override
                    public void onPositive() {

                    }

                    @Override
                    public void onNegative() {

                    }

                }).show();
                break;
        }
    }

    private void submit() {
        // validate
        String two = et_two.getText().toString().trim();
        if (TextUtils.isEmpty(two)) {
            showDialog.showAlerDialog(this,false,"登陆失败","验证码不得为空！");
            return;
        }
        if (flag){//密码登陆逻辑

        }else{//验证码登陆逻辑

        }
        startActivity(new Intent(this, MainActivity.class));
        ShareUtils.putBoolean(this,"Login_Static",true);
        DisplayActivity.instance.finish();//调用
        finish();
        // TODO validate success, do something


    }
}
