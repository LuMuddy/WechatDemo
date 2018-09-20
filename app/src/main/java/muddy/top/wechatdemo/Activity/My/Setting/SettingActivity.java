package muddy.top.wechatdemo.Activity.My.Setting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class SettingActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_cancle;
    private RelativeLayout rl_head;
    private ImageView iv_AccountSecurity_enter;
    private RelativeLayout rl_AccountSecurity;
    private ImageView iv_MessageNotification_enter;
    private RelativeLayout rl_MessageNotification;
    private ImageView iv_Privacy_enter;
    private RelativeLayout rl_Privacy;
    private ImageView iv_GeneralPurpose_enter;
    private RelativeLayout rl_GeneralPurpose;
    private ImageView iv_HelpFeedback_enter;
    private RelativeLayout rl_HelpFeedback;
    private ImageView iv_AboutWeChat_enter;
    private RelativeLayout rl_AboutWeChat;
    private TextView tv_gender;
    private ImageView iv_genders_enter;
    private ImageView iv_gender_enter;
    private RelativeLayout rl_gender;
    private Button bt_SwitchAccount;
    private RelativeLayout rl_SwitchAccount;
    private Button bt_AignOut;
    private RelativeLayout rl_AignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initView();

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        iv_AccountSecurity_enter = (ImageView) findViewById(R.id.iv_AccountSecurity_enter);
        rl_AccountSecurity = (RelativeLayout) findViewById(R.id.rl_AccountSecurity);
        iv_MessageNotification_enter = (ImageView) findViewById(R.id.iv_MessageNotification_enter);
        rl_MessageNotification = (RelativeLayout) findViewById(R.id.rl_MessageNotification);
        iv_Privacy_enter = (ImageView) findViewById(R.id.iv_Privacy_enter);
        rl_Privacy = (RelativeLayout) findViewById(R.id.rl_Privacy);
        iv_GeneralPurpose_enter = (ImageView) findViewById(R.id.iv_GeneralPurpose_enter);
        rl_GeneralPurpose = (RelativeLayout) findViewById(R.id.rl_GeneralPurpose);
        iv_HelpFeedback_enter = (ImageView) findViewById(R.id.iv_HelpFeedback_enter);
        rl_HelpFeedback = (RelativeLayout) findViewById(R.id.rl_HelpFeedback);
        iv_AboutWeChat_enter = (ImageView) findViewById(R.id.iv_AboutWeChat_enter);
        rl_AboutWeChat = (RelativeLayout) findViewById(R.id.rl_AboutWeChat);
        tv_gender = (TextView) findViewById(R.id.tv_gender);
        iv_genders_enter = (ImageView) findViewById(R.id.iv_genders_enter);
        iv_gender_enter = (ImageView) findViewById(R.id.iv_gender_enter);
        rl_gender = (RelativeLayout) findViewById(R.id.rl_gender);
        bt_SwitchAccount = (Button) findViewById(R.id.bt_SwitchAccount);
        rl_SwitchAccount = (RelativeLayout) findViewById(R.id.rl_SwitchAccount);
        bt_AignOut = (Button) findViewById(R.id.bt_AignOut);
        rl_AignOut = (RelativeLayout) findViewById(R.id.rl_AignOut);
        bt_cancle.setOnClickListener(this);
        bt_SwitchAccount.setOnClickListener(this);
        bt_AignOut.setOnClickListener(this);
        rl_AccountSecurity.setOnClickListener(this);
        rl_MessageNotification.setOnClickListener(this);
        rl_Privacy.setOnClickListener(this);
        rl_GeneralPurpose.setOnClickListener(this);
        rl_HelpFeedback.setOnClickListener(this);
        rl_AboutWeChat.setOnClickListener(this);
        rl_gender.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_AccountSecurity://账号与安全

                break;
            case R.id.rl_MessageNotification://新消息通知
                break;
            case R.id.rl_Privacy://隐私
                break;
            case R.id.rl_GeneralPurpose://通用
                break;
            case R.id.rl_HelpFeedback://帮助与反馈
                break;
            case R.id.rl_AboutWeChat://关于微信
                break;
            case R.id.rl_gender://插件
                break;


            case R.id.bt_cancle:
                finish();
                break;
            case R.id.bt_SwitchAccount://切换账号

                break;
            case R.id.bt_AignOut://退出登陆

                break;
        }
    }
}
