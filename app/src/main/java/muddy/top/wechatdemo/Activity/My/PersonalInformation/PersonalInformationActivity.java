package muddy.top.wechatdemo.Activity.My.PersonalInformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.More.MoreActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.Address.MyAddressActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.MyQrCodeActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.NameSettingActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.PersonalAvatarActivity;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class PersonalInformationActivity extends BaseActivity implements View.OnClickListener {


    private Button bt_cancle;
    private RelativeLayout rl_head;
    private TextView tv_avatar;
    private ImageView iv_avatar;
    private ImageView iv_avatar_enter;
    private RelativeLayout rl_avatar;
    private TextView tv_name;
    private ImageView iv_name_enter;
    private RelativeLayout rl_name;
    private TextView tv_wechat_name;
    private RelativeLayout rl_wechat_name;
    private ImageView iv_MicroSignal;
    private ImageView iv_MicroSignal_enter;
    private RelativeLayout rl_MicroSignal;
    private ImageView iv_More;
    private RelativeLayout rl_More;
    private ImageView iv_MyAddress;
    private RelativeLayout rl_MyAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        initView();

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        tv_avatar = (TextView) findViewById(R.id.tv_avatar);
        iv_avatar = (ImageView) findViewById(R.id.iv_avatar);
        iv_avatar_enter = (ImageView) findViewById(R.id.iv_avatar_enter);
        rl_avatar = (RelativeLayout) findViewById(R.id.rl_avatar);
        tv_name = (TextView) findViewById(R.id.tv_name);
        iv_name_enter = (ImageView) findViewById(R.id.iv_name_enter);
        rl_name = (RelativeLayout) findViewById(R.id.rl_name);
        tv_wechat_name = (TextView) findViewById(R.id.tv_wechat_name);
        iv_MicroSignal = (ImageView) findViewById(R.id.iv_MicroSignal);
        rl_MicroSignal = (RelativeLayout) findViewById(R.id.rl_MicroSignal);
        iv_More = (ImageView) findViewById(R.id.iv_More);
        rl_More = (RelativeLayout) findViewById(R.id.rl_More);
        iv_MyAddress = (ImageView) findViewById(R.id.iv_MyAddress);
        rl_MyAddress = (RelativeLayout) findViewById(R.id.rl_MyAddress);
        rl_head.setOnClickListener(this);
        rl_avatar.setOnClickListener(this);
        rl_name.setOnClickListener(this);
        rl_MicroSignal.setOnClickListener(this);
        rl_More.setOnClickListener(this);
        rl_MyAddress.setOnClickListener(this);
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        bt_cancle.setOnClickListener(this);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        rl_head.setOnClickListener(this);
        tv_avatar = (TextView) findViewById(R.id.tv_avatar);
        tv_avatar.setOnClickListener(this);
        iv_avatar = (ImageView) findViewById(R.id.iv_avatar);
        iv_avatar.setOnClickListener(this);
        iv_avatar_enter = (ImageView) findViewById(R.id.iv_avatar_enter);
        iv_avatar_enter.setOnClickListener(this);
        rl_avatar = (RelativeLayout) findViewById(R.id.rl_avatar);
        rl_avatar.setOnClickListener(this);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_name.setOnClickListener(this);
        iv_name_enter = (ImageView) findViewById(R.id.iv_name_enter);
        iv_name_enter.setOnClickListener(this);
        rl_name = (RelativeLayout) findViewById(R.id.rl_name);
        rl_name.setOnClickListener(this);
        tv_wechat_name = (TextView) findViewById(R.id.tv_wechat_name);
        tv_wechat_name.setOnClickListener(this);
        rl_wechat_name = (RelativeLayout) findViewById(R.id.rl_wechat_name);
        rl_wechat_name.setOnClickListener(this);
        iv_MicroSignal = (ImageView) findViewById(R.id.iv_MicroSignal);
        iv_MicroSignal.setOnClickListener(this);
        iv_MicroSignal_enter = (ImageView) findViewById(R.id.iv_MicroSignal_enter);
        iv_MicroSignal_enter.setOnClickListener(this);
        rl_MicroSignal = (RelativeLayout) findViewById(R.id.rl_MicroSignal);
        rl_MicroSignal.setOnClickListener(this);
        iv_More = (ImageView) findViewById(R.id.iv_More);
        iv_More.setOnClickListener(this);
        rl_More = (RelativeLayout) findViewById(R.id.rl_More);
        rl_More.setOnClickListener(this);
        iv_MyAddress = (ImageView) findViewById(R.id.iv_MyAddress);
        iv_MyAddress.setOnClickListener(this);
        rl_MyAddress = (RelativeLayout) findViewById(R.id.rl_MyAddress);
        rl_MyAddress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_avatar://头像
                startActivity(new Intent(this, PersonalAvatarActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_name://名字
                startActivity(new Intent(this, NameSettingActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_MicroSignal://二维码
                startActivity(new Intent(this, MyQrCodeActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_More://更多
                startActivity(new Intent(this, MoreActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_MyAddress://我的地址
                startActivity(new Intent(this, MyAddressActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.bt_cancle:
                finish();
                break;
        }

    }
}
