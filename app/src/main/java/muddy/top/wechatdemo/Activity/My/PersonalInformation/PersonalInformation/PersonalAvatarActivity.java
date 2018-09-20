package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.bean.TieBean;
import com.dou361.dialogui.listener.DialogUIItemListener;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.L;

import java.util.ArrayList;
import java.util.List;

public class PersonalAvatarActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_cancle;
    private ImageView iv_setting;
    private RelativeLayout rl_head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_avatar);
        initView();
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
    }

    private void initView() {
        bt_cancle = (Button) findViewById(R.id.bt_cancle);
        iv_setting = (ImageView) findViewById(R.id.iv_setting);
        iv_setting.setOnClickListener(this);
        bt_cancle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_cancle:
                finish();
                break;
            case R.id.iv_setting:
                List<TieBean> strings = new ArrayList<TieBean>();
                strings.add(new TieBean(getString(R.string.TakePhoto)));
                strings.add(new TieBean(getString(R.string.ChooseMobilePhotoAlbum)));
                strings.add(new TieBean(getString(R.string.ViewPreviousAvatar)));
                strings.add(new TieBean(getString(R.string.savePicture)));
                for (int  i=0;i<strings.size();i++){
                    System.out.println(strings.get(i).getTitle());
                }
                DialogUIUtils.showSheet(this, strings, "取消", Gravity.BOTTOM, true, true, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {

                    }

                    @Override
                    public void onBottomBtnClick() {

                    }
                }).show();
                L.i("-----------------------");
                break;
        }
    }
}
