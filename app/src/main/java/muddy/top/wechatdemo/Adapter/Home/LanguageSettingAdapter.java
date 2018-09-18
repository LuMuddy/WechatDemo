package muddy.top.wechatdemo.Adapter.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import muddy.top.wechatdemo.Eneity.Home.LanguageSettingData;
import muddy.top.wechatdemo.R;

/**
 * @Author Muddy
 * @Time 2018/9/13
 * @Describe
 */
public class LanguageSettingAdapter extends BaseAdapter{
    private List<LanguageSettingData> mList;
    private LanguageSettingData data;
    private LayoutInflater inflater;
    private Context mContext;
    public LanguageSettingAdapter(Context mContext, List<LanguageSettingData> mList){
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView=inflater.inflate(R.layout.language_item,null);
            viewHolder.Cb_Check=(CheckBox)convertView.findViewById(R.id.Cb_Check);
            viewHolder.Tv_Classfiy=(TextView)convertView.findViewById(R.id.Tv_Classfiy);
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        data=mList.get(position);
        viewHolder.Cb_Check.setChecked(data.isCheck());
        viewHolder.Tv_Classfiy.setText(data.getLanguage());
        return convertView;
    }
    public class ViewHolder{
        public CheckBox Cb_Check;
        private TextView Tv_Classfiy;
    }
}
