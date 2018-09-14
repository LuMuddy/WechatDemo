package muddy.top.wechatdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import muddy.top.wechatdemo.R;

public class MoblieLoginActivity extends AppCompatActivity implements View.OnClickListener {

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

        bt_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_next:

                break;
        }
    }

    private void submit() {
        // validate
        String two = et_two.getText().toString().trim();
        if (TextUtils.isEmpty(two)) {
            Toast.makeText(this, "two不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
