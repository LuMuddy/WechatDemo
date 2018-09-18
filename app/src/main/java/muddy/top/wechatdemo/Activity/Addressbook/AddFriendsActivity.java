package muddy.top.wechatdemo.Activity.Addressbook;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class AddFriendsActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_back;
    private RelativeLayout rl_head;
    private LinearLayout ll_search;
    private ImageView iv_radar;
    private RelativeLayout rl_radar;
    private ImageView iv_group;
    private RelativeLayout rl_group;
    private ImageView iv_scan;
    private RelativeLayout rl_scan;
    private ImageView iv_Contact;
    private RelativeLayout rl_Contact;
    private ImageView iv_public;
    private RelativeLayout rl_public;
    private ImageView iv_enterprise;
    private RelativeLayout rl_enterprise;
    private ImageView iv_scan_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friends);

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);

        initView();
    }

    private void initView() {
        iv_scan_code=(ImageView)findViewById(R.id.iv_scan_code) ;
        iv_back = (ImageView) findViewById(R.id.iv_back);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        ll_search = (LinearLayout) findViewById(R.id.ll_search);
        iv_radar = (ImageView) findViewById(R.id.iv_radar);
        rl_radar = (RelativeLayout) findViewById(R.id.rl_radar);
        iv_group = (ImageView) findViewById(R.id.iv_group);
        rl_group = (RelativeLayout) findViewById(R.id.rl_group);
        iv_scan = (ImageView) findViewById(R.id.iv_scan);
        rl_scan = (RelativeLayout) findViewById(R.id.rl_scan);
        iv_Contact = (ImageView) findViewById(R.id.iv_Contact);
        rl_Contact = (RelativeLayout) findViewById(R.id.rl_Contact);
        iv_public = (ImageView) findViewById(R.id.iv_public);
        rl_public = (RelativeLayout) findViewById(R.id.rl_public);
        iv_enterprise = (ImageView) findViewById(R.id.iv_enterprise);
        rl_enterprise = (RelativeLayout) findViewById(R.id.rl_enterprise);
        iv_back.setOnClickListener(this);
        ll_search.setOnClickListener(this);
        rl_group.setOnClickListener(this);
        ll_search.setOnClickListener(this);
        rl_scan.setOnClickListener(this);
        rl_Contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.iv_back:
                finish();
                break;
            case R.id.ll_search://搜索

                break;
            case R.id.iv_scan_code://用户二维码展示

                break;
            case R.id.rl_group://面对面群聊

                break;
            case R.id.rl_scan://扫一扫

                break;
            case R.id.rl_Contact://手机联系人

                break;
            case R.id. rl_public://公众号

                break;
            case R.id.rl_enterprise://企业联系人

                break;
        }
    }
}
