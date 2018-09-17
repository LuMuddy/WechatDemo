package muddy.top.wechatdemo.Fragment.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import muddy.top.wechatdemo.Application.BaseFragment;
import muddy.top.wechatdemo.R;

public class FragmentFind extends BaseFragment implements View.OnClickListener{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_find,container,false);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}