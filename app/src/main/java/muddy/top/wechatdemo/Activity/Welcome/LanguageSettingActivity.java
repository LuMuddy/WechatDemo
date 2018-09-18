package muddy.top.wechatdemo.Activity.Welcome;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import muddy.top.wechatdemo.Adapter.Home.LanguageSettingAdapter;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.Eneity.Home.LanguageSettingData;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.LanguageUtils;
import muddy.top.wechatdemo.Utils.ShareUtils;
import muddy.top.wechatdemo.Utils.StaticClass;


public class LanguageSettingActivity extends BaseActivity implements View.OnClickListener {
    private ImageView iv_back;
    private Button bt_save;
    private ListView lv_language;
    private List<LanguageSettingData> mList = new ArrayList<>();
    private LanguageSettingAdapter adapter;
    private String[] Language = new String[]{"auto","中文","中文繁体","英语"};

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
        lv_language.setOnItemClickListener(new AdapterView.OnItemClickListener() {//ListView点击事件
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < mList.size(); i++) {//遍历，如果是未选中状态的话，那么就都变成未选中
                    if (i==position){
                        mList.get(position).setCheck(!mList.get(position).isCheck());

                    }else{
                        mList.get(i).setCheck(false);
                    }
                }
                LanguageSettingAdapter.ViewHolder viewHolder = (LanguageSettingAdapter.ViewHolder) view.getTag();
                // 改变CheckBox的状态
                viewHolder.Cb_Check.toggle();
                adapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_save:
                int position=-1;
                for (int i=0;i<mList.size();i++){
                    if (mList.get(i).isCheck()){
                        position=i;
                        break;
                    }
                }

                switchPosition(position);


            case R.id.iv_back:
                finish();
                break;
        }
    }

    private void switchPosition(int type) {
        boolean sameLanguage = LanguageUtils.isSameLanguage(this, type);
        if (!sameLanguage) {
            LanguageUtils.setLocale(this, type);
            // 前面取系统语言时判断spType=0时取第一值，所以设置完语言后缓存type
            LanguageUtils.putLanguageType(this, type);
            LanguageUtils.toRestartMainActvity(this);
        } else {
            // 缓存用户此次选择的类型，可能出现type不同而locale一样的情况（如：系统默认泰语type = 0，而我选择的也是泰语type = 3）
            LanguageUtils.putLanguageType(this, type);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mList!=null){
            for(int i=0;i<Language.length;i++){
                LanguageSettingData data = new LanguageSettingData();
                if (i==ShareUtils.getInt(this, StaticClass.LOCALE_LANGUAGE, 0)){
                    data.setCheck(true);
                }else{
                    data.setCheck(false);
                }
                data.setLanguage(Language[i]);
                mList.add(data);
            }
            adapter = new LanguageSettingAdapter(this, mList);
            lv_language.setAdapter(adapter);
        }
    }


}
