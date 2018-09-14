package muddy.top.wechatdemo.View;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.widget.TextView;

import java.lang.reflect.Field;



/**
 * @Author Muddy
 * @Time 2018/9/14
 * @Describe 自带dialog封装
 */
public class showDialog {
    public static void showAlerDialog(Context mContext, boolean showQuit, String title, String setMessage) {
        AlertDialog dialog;
        if (showQuit){
            dialog = new AlertDialog.Builder(mContext)
            .setTitle(title)
            .setMessage(setMessage)
            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            })
            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            })
            .create();
        }else{
            dialog = new AlertDialog.Builder(mContext)
                .setTitle(title)
             .setMessage(setMessage)
             .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                 }
             })
             .create();
}

        dialog.show();

// 在dialog执行show之后才能来设置
        TextView tvMsg = (TextView) dialog.findViewById(android.R.id.message);
        tvMsg.setTextSize(16);
        tvMsg.setTextColor(Color.parseColor("#4E4E4E"));
        dialog.getButton(dialog.BUTTON_NEGATIVE).setTextSize(16);
        dialog.getButton(dialog.BUTTON_NEGATIVE).setTextColor(Color.parseColor("#1AAD19"));
        dialog.getButton(dialog.BUTTON_POSITIVE).setTextSize(16);
        dialog.getButton(dialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#1AAD19"));
        try {
            Field mAlert = AlertDialog.class.getDeclaredField("mAlert");
            mAlert.setAccessible(true);
            Object alertController = mAlert.get(dialog);

            Field mTitleView = alertController.getClass().getDeclaredField("mTitleView");
            mTitleView.setAccessible(true);

            TextView tvTitle = (TextView) mTitleView.get(alertController);
            if (null != tvTitle) {
                tvTitle.setTextSize(16);
                tvTitle.setTextColor(Color.parseColor("#000000"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
