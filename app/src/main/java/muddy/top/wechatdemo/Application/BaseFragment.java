package muddy.top.wechatdemo.Application;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.gyf.barlibrary.ImmersionBar;
import muddy.top.wechatdemo.Utils.LanguageUtils;

public class BaseFragment extends Fragment {
    private ImmersionBar mImmersionBar;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.init();   //所有子类都将继承这些相同的属性
        //  设置本地化语言
        setLocale();
        //添加activity
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden && mImmersionBar != null)
            mImmersionBar.init();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mImmersionBar != null)
            mImmersionBar.destroy();
        super.onDestroy();
    }
    private void setLocale() {
        if (!LanguageUtils.isSameLanguage(getContext())) {
            LanguageUtils.setLocale(getContext());
            LanguageUtils.toRestartMainActvity((Activity) getContext());
        }
    }
}
