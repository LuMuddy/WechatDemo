package muddy.top.wechatdemo.Application;

import android.app.Application;
import android.content.Context;

import muddy.top.wechatdemo.Utils.LanguageUtils;

/**
 * Created by Fitem on 2017/12/8.
 */

public class AppApplication extends Application {
    private static Application baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        //  设置本地化语言
        LanguageUtils.setLocale(this);
    }

    public static Context getAppContext() {
        return baseApplication;
    }
}
