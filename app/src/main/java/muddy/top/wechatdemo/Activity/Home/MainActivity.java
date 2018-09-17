package muddy.top.wechatdemo.Activity.Home;


import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import muddy.top.wechatdemo.Activity.Addressbook.AddFriendsActivity;
import muddy.top.wechatdemo.Adapter.MyFragmentPagerAdapter;
import muddy.top.wechatdemo.Application.BaseActivity;
import muddy.top.wechatdemo.R;
import muddy.top.wechatdemo.View.PopWindow;


public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener, View.OnClickListener {
    private static final String TAG = "MainActivity";
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;
    private TextView titleBarText;
    private RadioGroup rgTabBar;
    private RadioButton rb_wechat;
    private RadioButton rb_address_book;
    private RadioButton rb_find;
    private RadioButton rb_my;
    private ViewPager viewpager;
    private MyFragmentPagerAdapter mAdapter;
    private ImageView iv_add,iv_ear;
    private boolean home=true;//默认为首页

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        initView();
        RadioButton[] rbs = new RadioButton[4];
        rbs[0] =rb_wechat;
        rbs[1] = rb_address_book;
        rbs[2] = rb_find;
        rbs[3] = rb_my;
        for (RadioButton rb : rbs) {
            Drawable[] drawables = rb.getCompoundDrawables();
            Rect r = new Rect(0, 0, drawables[1].getMinimumWidth()*2/4, drawables[1].getMinimumHeight()*2/4);
            drawables[1].setBounds(r);
            rb.setCompoundDrawables(null,drawables[1],null,null);
        }

    }

    private void initView() {
        titleBarText = (TextView) findViewById(R.id.title_bar_text);
        rgTabBar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_wechat = (RadioButton) findViewById(R.id.rb_wechat);
        rb_address_book = (RadioButton) findViewById(R.id.rb_address_book);
        rb_find = (RadioButton) findViewById(R.id.rb_find);
        rb_my = (RadioButton) findViewById(R.id.rb_my);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        iv_add= (ImageView) findViewById(R.id.iv_add);
        iv_ear = (ImageView) findViewById(R.id.iv_ear);
        iv_add.setOnClickListener(this);
        rgTabBar.setOnCheckedChangeListener(this);
        viewpager.setAdapter(mAdapter);
        viewpager.setCurrentItem(0);
        viewpager.addOnPageChangeListener(this);
        rb_wechat.setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_wechat:
                viewpager.setCurrentItem(PAGE_ONE);
                titleBarText.setText(getString(R.string.wechat));
                display(0);
                break;
            case R.id.rb_address_book:
                viewpager.setCurrentItem(PAGE_TWO);
                titleBarText.setText(getString(R.string.Addressbook));
                display(1);
                break;
            case R.id.rb_find:
                viewpager.setCurrentItem(PAGE_THREE);
                titleBarText.setText(getString(R.string.find));
                display(2);
                break;
            case R.id.rb_my:
                viewpager.setCurrentItem(PAGE_FOUR);
                titleBarText.setText(getString(R.string.my));
                display(3);
                break;
        }
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

        /**
         * 原博文中注释（state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕）有误
         * 特此更正为如下：
         *
         *SCROLL_STATE_IDLE : 值为0，表示当前页已经选定。
         *SCROLL_STATE_DRAGGING: 值为1，表示当前页面正在拖动。
         *SCROLL_STATE_SETTING: 值为2，表示当前页面正在拖动中，还没有到选定状态。
         */
        Log.i(TAG, "onPageScrollStateChanged: state::" + state);
        if (state == 2) {
            int currentItemPosition = viewpager.getCurrentItem();
            Log.w(TAG, "onPageScrollStateChanged: currentItemPosition::" + currentItemPosition);
            switch (currentItemPosition) {
                case PAGE_ONE:
                    rb_wechat.setChecked(true);
//                    titleBarText.setText("提醒");
                    display(0);
                    break;
                case PAGE_TWO:
                    rb_address_book.setChecked(true);
//                    titleBarText.setText("信息");
                    display(1);
                    break;
                case PAGE_THREE:
                    rb_find.setChecked(true);
//                    titleBarText.setText("我的");
                    display(2);
                    break;
                case PAGE_FOUR:
                    rb_my.setChecked(true);
//                    titleBarText.setText("设置");
                    display(3);
                    break;
            }
        }
    }
        public void display(int i){
        switch (i){
            case 0:
                home=true;
                iv_add.setVisibility(View.VISIBLE);
                iv_ear.setVisibility(View.VISIBLE);
                break;
            case 1:
                home=false;
                iv_add.setVisibility(View.VISIBLE);
                iv_ear.setVisibility(View.GONE);
                break;

            case 2:
                home=true;
                iv_add.setVisibility(View.GONE);
                iv_ear.setVisibility(View.GONE);
                break;

            case 3:
                home=true;
                iv_add.setVisibility(View.GONE);
                iv_ear.setVisibility(View.GONE);
                break;

        }

        }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.iv_add://打开右上角的+
                    if (home){
                        PopWindow popWindow = new PopWindow(this);
                        popWindow.showPopupWindow(findViewById(R.id.iv_add));
                    }else{//添加朋友
                    startActivity(new Intent(this, AddFriendsActivity.class));
                    }
                    break;
            }
    }
}