package muddy.top.wechatdemo.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import muddy.top.wechatdemo.Application.BaseActivity;
import top.muddy.wechatdemo.R;


public class Language_setting extends BaseActivity implements View.OnClickListener {
    private ImageView iv_back;
    private Button bt_save;
    private ListView lv_language;
    private String[] city = {"Auto","中文","英文","请问","撒旦","asd","撒旦"} ;  //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_setting);
        initView();
    }

    private void initView() {
        bt_save=(Button)findViewById(R.id.bt_save);
        iv_back=(ImageView)findViewById(R.id.iv_back);
        lv_language=(ListView)findViewById(R.id.lv_language);
        bt_save.setOnClickListener(this);
        iv_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_save:

                break;

            case R.id.iv_back:
                finish();
                break;
        }
    }

}
