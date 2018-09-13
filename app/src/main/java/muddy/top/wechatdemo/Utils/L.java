package muddy.top.wechatdemo.Utils;

import android.util.Log;


/**
 * @Author Muddy
 * @Time 2018/8/28
 * @Describe Log封装
 */
public class L {
    //开关
    public  static final boolean DEBUG=true;

    public  static  final String TAG="WechatDemo";

    //五个等级 DIWEF

    public  static void d(String text){
        if (DEBUG){
            Log.d(TAG,text);
        }
    }
    public  static void i(String text){
        if (DEBUG){
            Log.i(TAG,text);
        }
    }
    public  static void w(String text){
        if (DEBUG){
            Log.w(TAG,text);
        }
    }
    public  static void e(String text){
        if (DEBUG){
            Log.e(TAG,text);
        }
    }
}
