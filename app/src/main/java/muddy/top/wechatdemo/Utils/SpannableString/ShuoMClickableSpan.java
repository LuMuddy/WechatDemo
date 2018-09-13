package muddy.top.wechatdemo.Utils.SpannableString;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

import static muddy.top.wechatdemo.Utils.StaticClass.PROTOCOL_ONE;

/**
 * @Author Muddy
 * @Time 2018/9/13
 * @Describe
 */
public class ShuoMClickableSpan extends ClickableSpan {

    String string;
    Context context;
    public ShuoMClickableSpan(String str,Context context){
        super();
        this.string = str;
        this.context = context;
    }


    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setColor(Color.BLUE);
        ds.setUnderlineText(true);      //设置下划线
    }




    @Override
    public void onClick(View widget) {
        Uri uri = Uri.parse(PROTOCOL_ONE);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        context.startActivity(intent);
    }


}

