package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class NameSettingActivity extends BaseActivity implements View.OnClickListener {

    private RelativeLayout rl_head;
    private EditText et_name;
    private Button bt_cancle;
    private Button bt_sure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_setting);
        initView();

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        et_name = (EditText) findViewById(R.id.et_name);
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        bt_cancle.setOnClickListener(this);
        bt_sure = (Button) findViewById(R.id.bt_sure);
        bt_sure.setOnClickListener(this);

        et_name.setSelection(et_name.getText().length());
    }

    private void submit() {
        // validate
        String name = et_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "name不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_cancle:
                    finish();
                break;
            case R.id.bt_sure:

                break;
        }
    }
}
