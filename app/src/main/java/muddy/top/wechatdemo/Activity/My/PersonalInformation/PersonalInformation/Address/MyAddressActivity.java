package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.Address;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.hzh.slide.back.layout.SlideBackLayout;
import muddy.top.wechatdemo.Adapter.My.PersonalInforMation.Address.AddressAdapter;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.Eneity.My.PersonalInforMation.Address.AddressData;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static muddy.top.wechatdemo.Utils.StaticClass.ADDRESS_JSON;

public class MyAddressActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_return;
    private RelativeLayout rl_head;
    private ListView lv_address;
    private ImageView iv_add;
    private ImageView iv_Signature_enter;
    private RelativeLayout rl_Signature;
    private List<AddressData> mList = new ArrayList<>();
    private AddressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_address);
        initView();
        SlideBackLayout layout = new SlideBackLayout(this);
        layout.bind(this);
        initData();
    }

    private void initData() {
        try {
            JSONArray jsonList = new JSONArray(ADDRESS_JSON);
            for (int i = 0; i < jsonList.length(); i++) {
                JSONObject json = (JSONObject) jsonList.get(i);
                AddressData data = new AddressData();
                data.setAddress(String.valueOf(json.get("Address")));
                data.setAddressName(String.valueOf(json.get("addressName")));
                data.setMobile(String.valueOf(json.get("mobile")));
                data.setDetailedArea(String.valueOf(json.get("DetailedArea")));
                data.setDak(String.valueOf(json.get("dak")));
                L.i(String.valueOf(json.get("dak"))+"dak-----------");
                mList.add(data);
            }
            adapter = new AddressAdapter(this, mList);
            lv_address.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void initView() {
        bt_return = (Button) findViewById(R.id.bt_return);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        lv_address = (ListView) findViewById(R.id.lv_address);
        iv_add = (ImageView) findViewById(R.id.iv_add);
        iv_Signature_enter = (ImageView) findViewById(R.id.iv_Signature_enter);
        rl_Signature = (RelativeLayout) findViewById(R.id.rl_Signature);
        bt_return.setOnClickListener(this);
        rl_Signature.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_return:
                finish();
                break;
            case R.id.rl_Signature://新增地址
                startActivity(new Intent(this, AddressEditActivity.class));
                overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
        }
    }

}
