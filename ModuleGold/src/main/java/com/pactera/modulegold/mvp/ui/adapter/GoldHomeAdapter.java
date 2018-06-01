package com.pactera.modulegold.mvp.ui.adapter;

import android.view.View;

import com.jess.arms.base.BaseHolder;
import com.jess.arms.base.DefaultAdapter;
import com.pactera.modulegold.mvp.model.entity.GoldListBean;

import java.util.List;

public class GoldHomeAdapter extends DefaultAdapter<GoldListBean> {
    public GoldHomeAdapter(List<GoldListBean> infos) {
        super(infos);
    }

    @Override
    public BaseHolder<GoldListBean> getHolder(View v, int viewType) {
        return null;
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.gold_recycle_list;
    }
}
