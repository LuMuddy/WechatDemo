package muddy.top.wechatdemo.Activity.My.Wallet;

import android.os.Bundle;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class WalletActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }
}
