package muddy.top.wechatdemo.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;


import java.util.Locale;

import muddy.top.wechatdemo.Activity.DisplayActivity;
import muddy.top.wechatdemo.Application.AppApplication;

/**
 * Created by Fitem on 2017/12/8.
 */

public class LanguageUtils {

    private static final String TAG = "LanguageUtils";
    private static Locale thLocale = new Locale("th");

    /**
     * 设置本地化语言
     *
     * @param context
     * @param type
     */
    public static void setLocale(Context context, int type) {
        // 解决webview所在的activity语言没有切换问题
        new WebView(context).destroy();
        // 切换语言
        Resources resources = context.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        config.locale = getLocaleByType(type);
        Log.d(TAG, "setLocale: " + config.locale.toString());
        resources.updateConfiguration(config, dm);
    }

    /**
     * 根据type获取locale
     *
     * @param type
     * @return
     */
    private static Locale getLocaleByType(int type) {
        Locale locale;
        // 应用用户选择语言
        switch (type) {
            case 0:
                //由于API仅支持7.0，需要判断，否则程序会crash(解决7.0以上系统不能跟随系统语言问题)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    LocaleList localeList = LocaleList.getDefault();
                    int spType = getLanguageType(AppApplication.getAppContext());
                    // 如果app已选择不跟随系统语言，则取第二个数据为系统默认语言
                    if (spType != 0 && localeList.size() > 1) {
                        locale = localeList.get(1);
                    } else {
                        locale = localeList.get(0);
                    }
                } else {
                    locale = Locale.getDefault();
                }
                break;
            case 1:
                locale = Locale.CHINESE;
                break;
            case 2:
                locale = Locale.TRADITIONAL_CHINESE;
                break;
            case 3:
                locale = Locale.ENGLISH;
                break;

            default:
                locale = thLocale;
                break;
        }
        return locale;
    }

    /**
     * 根据sp数据设置本地化语言
     *
     * @param context
     */
    public static void setLocale(Context context) {
        int type = getLanguageType(context);
        setLocale(context, type);
    }

    /**
     * 判断是否是相同语言
     *
     * @param context
     * @return
     */
    public static boolean isSameLanguage(Context context) {
        int type = getLanguageType(context);
        return isSameLanguage(context, type);
    }

    /**
     * 判断是否是相同语言
     *
     * @param context
     * @param type
     * @return
     */
    public static boolean isSameLanguage(Context context, int type) {
        Locale locale = getLocaleByType(type);
        Locale appLocale = context.getResources().getConfiguration().locale;
        boolean equals = appLocale.equals(locale);
        Log.d(TAG, "isSameLanguage: " + locale.toString() + " / " + appLocale.toString() + " / " + equals);
        return equals;
    }

    /**
     * sp存储本地语言类型
     *
     * @param context
     * @param type
     */
    public static void putLanguageType(Context context, int type) {
        ShareUtils.putInt(context,StaticClass.LOCALE_LANGUAGE,type);
    }

    /**
     * sp获取本地存储语言类型
     *
     * @param context
     * @return
     */
    private static int getLanguageType(Context context) {
        int type = ShareUtils.getInt(context,StaticClass.LOCALE_LANGUAGE, 0);
        return type;
    }

    /**
     * 跳转主页
     *
     * @param activity
     */
    public static void toRestartMainActvity(Activity activity) {
        Intent intent = new Intent(activity, DisplayActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        activity.startActivity(intent);
    }
}
