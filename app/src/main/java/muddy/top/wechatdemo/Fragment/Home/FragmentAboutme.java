package muddy.top.wechatdemo.Fragment.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import muddy.top.wechatdemo.Activity.My.Album.AlbumActivity;
import muddy.top.wechatdemo.Activity.My.CardPackage.CardPackageActivity;
import muddy.top.wechatdemo.Activity.My.Collection.CollectionActivity;
import muddy.top.wechatdemo.Activity.My.Expression.ExpressionActivity;
import muddy.top.wechatdemo.Activity.My.PersonalInformation.PersonalInformationActivity;
import muddy.top.wechatdemo.Activity.My.Setting.SettingActivity;
import muddy.top.wechatdemo.Activity.My.Wallet.WalletActivity;
import muddy.top.wechatdemo.Application.BaseFragment;
import muddy.top.wechatdemo.R;

public class FragmentAboutme extends BaseFragment implements View.OnClickListener {


    private ImageView iv_CircleFriends;
    private TextView tv_name;
    private ImageView iv_qc;
    private ImageView iv_enter;
    private RelativeLayout rl_Personal_information;
    private ImageView iv_wallet;
    private RelativeLayout rl_wallet;
    private ImageView iv_Authorization;
    private RelativeLayout rl_Authorization;
    private ImageView iv_Album;
    private RelativeLayout rl_Album;
    private ImageView iv_CardPackage;
    private RelativeLayout rl_CardPackage;
    private ImageView iv_Expression;
    private RelativeLayout rl_Expression;
    private ImageView iv_Setting;
    private RelativeLayout rl_Setting;
    private TextView tv_wechat_name;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_me, container, false);
        initView(view);
        return view;
    }


    private void initView(View view) {
        iv_CircleFriends = (ImageView) view.findViewById(R.id.iv_CircleFriends);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        iv_qc = (ImageView) view.findViewById(R.id.iv_qc);
        iv_enter = (ImageView) view.findViewById(R.id.iv_enter);
        rl_Personal_information = (RelativeLayout) view.findViewById(R.id.rl_Personal_information);
        iv_wallet = (ImageView) view.findViewById(R.id.iv_wallet);
        rl_wallet = (RelativeLayout) view.findViewById(R.id.rl_wallet);
        iv_Authorization = (ImageView) view.findViewById(R.id.iv_Authorization);
        rl_Authorization = (RelativeLayout) view.findViewById(R.id.rl_Authorization);
        iv_Album = (ImageView) view.findViewById(R.id.iv_Album);
        rl_Album = (RelativeLayout) view.findViewById(R.id.rl_Album);
        iv_CardPackage = (ImageView) view.findViewById(R.id.iv_CardPackage);
        rl_CardPackage = (RelativeLayout) view.findViewById(R.id.rl_CardPackage);
        iv_Expression = (ImageView) view.findViewById(R.id.iv_Expression);
        rl_Expression = (RelativeLayout) view.findViewById(R.id.rl_Expression);
        iv_Setting = (ImageView) view.findViewById(R.id.iv_Setting);
        rl_Setting = (RelativeLayout) view.findViewById(R.id.rl_Setting);
        tv_wechat_name = (TextView) view.findViewById(R.id.tv_wechat_name);
        rl_Personal_information.setOnClickListener(this);
        rl_wallet.setOnClickListener(this);
        rl_Authorization.setOnClickListener(this);
        rl_Album.setOnClickListener(this);
        rl_CardPackage.setOnClickListener(this);
        rl_Expression.setOnClickListener(this);
        rl_Setting.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_Personal_information:
                startActivity(new Intent(getActivity(), PersonalInformationActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_wallet:
                startActivity(new Intent(getActivity(), WalletActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_Authorization:
                startActivity(new Intent(getActivity(), CollectionActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_Album:
                startActivity(new Intent(getActivity(), AlbumActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_CardPackage:
                startActivity(new Intent(getActivity(), CardPackageActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_Expression:
                startActivity(new Intent(getActivity(), ExpressionActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
            case R.id.rl_Setting:
                startActivity(new Intent(getActivity(), SettingActivity.class));
                getActivity().overridePendingTransition(R.anim.activity_anim_in_right, R.anim.activity_anim_out_left);
                break;
        }
    }

}