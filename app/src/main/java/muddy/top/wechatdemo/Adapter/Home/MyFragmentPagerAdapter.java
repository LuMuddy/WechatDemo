package muddy.top.wechatdemo.Adapter.Home;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import android.widget.RadioButton;
import muddy.top.wechatdemo.Activity.Home.MainActivity;
import muddy.top.wechatdemo.Fragment.Home.FragmenAddressBook;
import muddy.top.wechatdemo.Fragment.Home.FragmentAboutme;
import muddy.top.wechatdemo.Fragment.Home.FragmentFind;
import muddy.top.wechatdemo.Fragment.Home.FragmentWechat;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private FragmentWechat WechatFragment;
    private FragmenAddressBook AddressBookFragmen;
    private FragmentFind FindFragment;
    private FragmentAboutme AboutmeFragment;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
       AddressBookFragmen = new FragmenAddressBook();
        AboutmeFragment = new FragmentAboutme();
        FindFragment = new FragmentFind();
       WechatFragment = new FragmentWechat();


    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case MainActivity.PAGE_ONE:
                fragment = WechatFragment;
                break;
            case MainActivity.PAGE_TWO:
                fragment = AddressBookFragmen;
                break;
            case MainActivity.PAGE_THREE:
                fragment = FindFragment;
                break;
            case MainActivity.PAGE_FOUR:
                fragment =AboutmeFragment;
                break;
        }
        return fragment;
    }


}
