package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.More;

import android.os.Bundle;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
// 地区
public class AreaActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }
}
