package muddy.top.wechatdemo.Activity.Addressbook;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class AddFriendsActivity extends BaseActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friends);
        initView();
    }

    private void initView() {
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
    }
}
