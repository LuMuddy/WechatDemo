package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.More;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.L;

public class GenderActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_cancle;
    private Button bt_sure;
    private RelativeLayout rl_head;
    private RadioButton rb_boy;
    private RelativeLayout rl_boy;
    private RadioButton rb_girl;
    private RelativeLayout rl_girl;
    private boolean sex=false;//false为男

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        initView();
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        bt_sure = (Button) findViewById(R.id.bt_sure);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        rb_boy = (RadioButton) findViewById(R.id.rb_boy);
        rl_boy = (RelativeLayout) findViewById(R.id.rl_boy);
        rb_girl = (RadioButton) findViewById(R.id.rb_girl);
        rl_girl = (RelativeLayout) findViewById(R.id.rl_girl);
        bt_cancle.setOnClickListener(this);
        bt_sure.setOnClickListener(this);
        rl_boy.setOnClickListener(this);
        rl_girl.setOnClickListener(this);
        rb_boy.setOnClickListener(this);
        rb_girl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_cancle:
                    finish();
                break;
            case R.id.bt_sure:
                    if (rb_boy.isChecked()){//男孩选中就是false
                        sex=false;
                        break;
                    }
                    if (rb_girl.isChecked()){//女孩选中就是true
                        sex=true;
                        break;
                    }
                break;
            case R.id.rl_boy:
            case R.id.rb_boy:
                    rb_girl.setChecked(false);
                    rb_boy.setChecked(true);
                break;
            case R.id.rl_girl:
            case R.id.rb_girl:
                    rb_girl.setChecked(true);
                    rb_boy.setChecked(false);
                break;
        }
    }
}
