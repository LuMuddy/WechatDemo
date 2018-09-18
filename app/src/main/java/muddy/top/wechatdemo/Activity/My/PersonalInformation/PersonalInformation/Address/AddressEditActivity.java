package muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.Address;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.Utils.L;

public class AddressEditActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_return;
    private Button bt_save;
    private RelativeLayout rl_head;
    private TextView tv_Contact;
    private EditText et_name;
    private ImageView iv_name_enter;
    private RelativeLayout rl_name;
    private TextView tv_mobile;
    private EditText et_mobile;
    private RelativeLayout rl_mobile;
    private TextView tv_SelectRegion;
    private EditText et_SelectRegion;
    private ImageView iv_SelectRegion_enter;
    private RelativeLayout rl_SelectRegion;
    private TextView tv_DetailedAddress;
    private EditText et_DetailedAddress;
    private RelativeLayout rl_DetailedAddress;
    private TextView tv_PostalCode;
    private EditText et_PostalCode;
    private RelativeLayout rl_PostalCode;
    private String Address, Dak,AddressName,DetailedArea,Mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_edit);
        initView();
        initData();
    }

    private void initData() {
        Intent intent = getIntent();
        Address = intent.getStringExtra("Address");
        Dak = intent.getStringExtra("Dak");
        AddressName = intent.getStringExtra("AddressName");
        DetailedArea = intent.getStringExtra("DetailedArea");
        Mobile = intent.getStringExtra("Mobile");
        if (!(TextUtils.isEmpty(Address)&&TextUtils.isEmpty(Dak)&&TextUtils.isEmpty(AddressName)&&TextUtils.isEmpty(DetailedArea)&&TextUtils.isEmpty(Mobile))){
            et_name.setText(AddressName);
            et_mobile.setText(Mobile);
            et_SelectRegion.setText(Address);
            et_DetailedAddress.setText(DetailedArea);
            et_PostalCode.setText(Dak);
            et_name.setSelection(et_name.getText().length());
            et_mobile.setSelection(et_mobile.getText().length());
            et_SelectRegion.setSelection(et_SelectRegion.getText().length());
            et_DetailedAddress.setSelection(et_DetailedAddress.getText().length());
            et_PostalCode.setSelection(et_PostalCode.getText().length());
        }
    }

    private void initView() {
        bt_return = (Button) findViewById(R.id.bt_return);
        bt_save = (Button) findViewById(R.id.bt_save);
        rl_head = (RelativeLayout) findViewById(R.id.rl_head);
        tv_Contact = (TextView) findViewById(R.id.tv_Contact);
        et_name = (EditText) findViewById(R.id.et_name);
        iv_name_enter = (ImageView) findViewById(R.id.iv_name_enter);
        rl_name = (RelativeLayout) findViewById(R.id.rl_name);
        tv_mobile = (TextView) findViewById(R.id.tv_mobile);
        et_mobile = (EditText) findViewById(R.id.et_mobile);
        rl_mobile = (RelativeLayout) findViewById(R.id.rl_mobile);
        tv_SelectRegion = (TextView) findViewById(R.id.tv_SelectRegion);
        et_SelectRegion = (EditText) findViewById(R.id.et_SelectRegion);
        iv_SelectRegion_enter = (ImageView) findViewById(R.id.iv_SelectRegion_enter);
        rl_SelectRegion = (RelativeLayout) findViewById(R.id.rl_SelectRegion);
        tv_DetailedAddress = (TextView) findViewById(R.id.tv_DetailedAddress);
        et_DetailedAddress = (EditText) findViewById(R.id.et_DetailedAddress);
        rl_DetailedAddress = (RelativeLayout) findViewById(R.id.rl_DetailedAddress);
        tv_PostalCode = (TextView) findViewById(R.id.tv_PostalCode);
        et_PostalCode = (EditText) findViewById(R.id.et_PostalCode);
        rl_PostalCode = (RelativeLayout) findViewById(R.id.rl_PostalCode);
        bt_return.setOnClickListener(this);
        bt_save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_return:
                finish();
                break;
            case R.id.bt_save:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String name = et_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "name不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String mobile = et_mobile.getText().toString().trim();
        if (TextUtils.isEmpty(mobile)) {
            Toast.makeText(this, "mobile不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String SelectRegion = et_SelectRegion.getText().toString().trim();
        if (TextUtils.isEmpty(SelectRegion)) {
            Toast.makeText(this, "SelectRegion不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String DetailedAddress = et_DetailedAddress.getText().toString().trim();
        if (TextUtils.isEmpty(DetailedAddress)) {
            Toast.makeText(this, "DetailedAddress不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String PostalCode = et_PostalCode.getText().toString().trim();
        if (TextUtils.isEmpty(PostalCode)) {
            Toast.makeText(this, "PostalCode不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
