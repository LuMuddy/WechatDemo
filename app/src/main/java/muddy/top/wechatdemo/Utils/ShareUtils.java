package muddy.top.wechatdemo.Utils;


/**
 * @Author Muddy
 * @Time 2018/8/28
 * @Describe ShareUtils封装
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import muddy.top.wechatdemo.Utils.AES.AES;

public class ShareUtils {

    public static final String NAME = "wechatdemo_config";

    //键 值
    public static void putString(Context mContext, String key, String value)  {
        try {
            SharedPreferences sp= mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
            String encrypt = AES.getInstance().encrypt(value.getBytes("UTF8"));
            sp.edit().putString(key,encrypt).commit();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    //键 默认值
    public static String getString(Context mContext, String key, String defValue){
            SharedPreferences sp= mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
            String decrypt = AES.getInstance().decrypt(sp.getString(key,defValue));
            return  decrypt;
    }
    //键 值
    public static void putInt(Context mContext, String key, int value){
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().putInt(key,value).commit();
    }

    //键 默认值
    public static int getInt(Context mContext, String key, int defValue){
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getInt(key,defValue);
    }

    //键 值
    public static void putBoolean(Context mContext, String key, boolean value){
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();
    }

    //键 默认值
    public static boolean getBoolean(Context mContext, String key, boolean defValue){
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key,defValue);
    }

    //刪除 单个
    public static void deleShare(Context mContext, String key){
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }

    //刪除 全部
    public static void deleAll(Context mContext){
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }

}
