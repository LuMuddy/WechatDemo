package muddy.top.wechatdemo.Activity.My.PersonalInformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.Address.MyAddressActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.More.MoreActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.MyQrCodeActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.NameSettingActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.PersonalAvatarActivity;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class PersonalInformationActivity extends BaseActivity implements View.OnClickListener {


    private RelativeLayout rl_avatar;
    private RelativeLayout rl_name;
    private RelativeLayout rl_wechat_name;
    private RelativeLayout rl_MicroSignal;
    private RelativeLayout rl_More;
    private RelativeLayout rl_MyAddress;
    private Button bt_cancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        initView();

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        bt_cancle=(Button)findViewById(R.id.bt_cancle);
        bt_cancle.setOnClickListener(this);
        rl_avatar = (RelativeLayout) findViewById(R.id.rl_avatar);
        rl_avatar.setOnClickListener(this);
        rl_name = (RelativeLayout) findViewById(R.id.rl_name);
        rl_name.setOnClickListener(this);
        rl_wechat_name = (RelativeLayout) findViewById(R.id.rl_wechat_name);
        rl_wechat_name.setOnClickListener(this);
        rl_MicroSignal = (RelativeLayout) findViewById(R.id.rl_MicroSignal);
        rl_MicroSignal.setOnClickListener(this);
        rl_More = (RelativeLayout) findViewById(R.id.rl_More);
        rl_More.setOnClickListener(this);
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
