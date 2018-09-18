package muddy.top.wechatdemo.Adapter.My.PersonalInforMation.Address;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.listener.DialogUIListener;
import muddy.top.wechatdemo.Activity.LoginRegistry.MoblieLoginActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformation.Address.AddressEditActivity;
import muddy.top.wechatdemo.Adapter.Home.LanguageSettingAdapter;
import muddy.top.wechatdemo.Eneity.My.PersonalInforMation.Address.AddressData;
import muddy.top.wechatdemo.R;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class AddressAdapter extends BaseAdapter {
    private List<AddressData> mList;
    private AddressData data;
    private LayoutInflater inflater;
    private Context mContext;
    public AddressAdapter(Context mContext, List<AddressData> mList){
        this.mContext=mContext;
        this.mList = mList;
        //获取系统服务
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView=inflater.inflate(R.layout.address_item,null);
            viewHolder.tv_add=(TextView)convertView.findViewById(R.id.tv_add);
            viewHolder.tv_name=(TextView)convertView.findViewById(R.id.tv_name);
            viewHolder.iv_edit=(ImageView)convertView.findViewById(R.id.iv_edit);
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        data=mList.get(position);
        viewHolder.tv_add.setText(data.getAddress());
        viewHolder.tv_name.setText(data.getAddressName());
        viewHolder.iv_edit.setOnClickListener(new ImageView.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("Address",mList.get(position).getAddress());
                intent.putExtra("Dak",mList.get(position).getDak());
                intent.putExtra("AddressName",mList.get(position).getAddressName());
                intent.putExtra("DetailedArea",mList.get(position).getDetailedArea());
                intent.putExtra("Mobile",mList.get(position).getMobile());
                intent.setClass(mContext, AddressEditActivity.class);
                mContext.startActivity(intent);

            }
        });

        return convertView;
    }
    public class ViewHolder{
        private ImageView iv_edit;
        private TextView tv_add,tv_name;
    }
}

