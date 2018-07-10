package com.efeiyi.bigwiki.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;

import com.efeiyi.bigwiki.R;
import com.efeiyi.bigwiki.activity.SharedDetailActivity;

import storm_lib.base.BaseCordovaFragment.BaseCordovaFragment;
import storm_lib.utils.LogUtils;

public class CordovaFragment extends BaseCordovaFragment {



    @Override
    protected String loadWebViewUrl() {
        return launchUrl;
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_cordova;
    }



    @Override
    protected void initData() {


        shareToDetail(getActivity().getIntent().getData());
    }

    public void shareToDetail(Uri data) {

        if (data != null) {
            LogUtils.d(TAG,"获取的分享消息 -------" + data.getQueryParameter("arg"));

            // 跳转 分享相关的页面

            Intent intent = new Intent(mContext, SharedDetailActivity.class);

            mContext.startActivity(intent);
        }
    }
}
