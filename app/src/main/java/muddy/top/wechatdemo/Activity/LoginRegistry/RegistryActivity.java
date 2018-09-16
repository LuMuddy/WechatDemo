package muddy.top.wechatdemo.Activity.LoginRegistry;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.widget.TextView;

import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.SpannableString.CopyOfShuoMClickableSpan;
import muddy.top.wechatdemo.Utils.SpannableString.ShuoMClickableSpan;

public class RegistryActivity extends BaseActivity {
    private TextView tv_copyright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        initView();
    }

    private void initView() {
        tv_copyright=(TextView)findViewById(R.id.tv_copyright);
        //底部提示语  快速咨询为超链
        String ttt = getString(R.string.protocolone);
        String sss = getString(R.string.protocoltwo);;
        SpannableString spanttt = new SpannableString(ttt);
        SpannableString spansss = new SpannableString(sss);
        ClickableSpan clickttt = new ShuoMClickableSpan(ttt, this);
        ClickableSpan clicksss = new CopyOfShuoMClickableSpan(sss, this);
        spanttt.setSpan(clickttt, 0, ttt.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spansss.setSpan(clicksss, 0, sss.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_copyright.setText(getString(R.string.copyright));
        tv_copyright.append(spanttt);
        tv_copyright.append(getText(R.string.and));
       tv_copyright.append(spansss);
        tv_copyright.setMovementMethod(LinkMovementMethod.getInstance());



    }
}
