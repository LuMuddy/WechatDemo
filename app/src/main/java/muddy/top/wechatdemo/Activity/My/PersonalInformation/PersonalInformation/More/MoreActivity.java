package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.More;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class MoreActivity extends BaseActivity implements View.OnClickListener {

    private RelativeLayout rl_head;
    private TextView tv_gender;
    private ImageView iv_gender_enter;
    private RelativeLayout rl_gender;
    private RelativeLayout rl_area;
    private TextView tv_Signature;
    private ImageView iv_Signature_enter;
    private RelativeLayout rl_Signature;
    private Button bt_cancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        initView();
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        tv_gender = (TextView) findViewById(R.id.tv_gender);
        iv_gender_enter = (ImageView) findViewById(R.id.iv_gender_enter);
        rl_gender = (RelativeLayout) findViewById(R.id.rl_gender);
        rl_area = (RelativeLayout) findViewById(R.id.rl_area);
        tv_Signature = (TextView) findViewById(R.id.tv_Signature);
        iv_Signature_enter = (ImageView) findViewById(R.id.iv_Signature_enter);
        rl_Signature = (RelativeLayout) findViewById(R.id.rl_Signature);
        rl_gender.setOnClickListener(this);
        rl_Signature.setOnClickListener(this);
        rl_area.setOnClickListener(this);

        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        bt_cancle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_gender:
                startActivity(new Intent(this, GenderActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_Signature:
                startActivity(new Intent(this, SignatureActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_area:
                startActivity(new Intent(this, AreaActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.bt_cancle:
                finish();
                break;

        }
    }
}
