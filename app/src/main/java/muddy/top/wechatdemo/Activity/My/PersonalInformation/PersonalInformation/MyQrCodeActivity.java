package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class MyQrCodeActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_cancle;
    private ImageView iv_setting;
    private RelativeLayout rl_head;
    private ImageView iv_head;
    private TextView tv_wechat_name;
    private RelativeLayout rl_top;
    private RelativeLayout rl_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_qr_code);
        initView();

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        iv_setting = (ImageView) findViewById(R.id.iv_setting);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        iv_head = (ImageView) findViewById(R.id.iv_head);
        tv_wechat_name = (TextView) findViewById(R.id.tv_wechat_name);
        rl_top = (RelativeLayout) findViewById(R.id.rl_top);
        rl_code = (RelativeLayout) findViewById(R.id.rl_code);
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
