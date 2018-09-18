package muddy.top.wechatdemo.Activity.My.Expression;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;

public class ExpressionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expression);
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }
}
