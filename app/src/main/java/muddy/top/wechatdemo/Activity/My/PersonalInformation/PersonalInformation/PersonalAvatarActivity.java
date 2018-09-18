package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class PersonalAvatarActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_cancle;
    private ImageView iv_setting;
    private RelativeLayout rl_head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_avatar);
        initView();
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        iv_setting = (ImageView) findViewById(R.id.iv_setting);
        iv_setting.setOnClickListener(this);
        bt_cancle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_cancle:
                finish();
                break;
            case R.id.iv_setting:

                break;
        }
    }
}
