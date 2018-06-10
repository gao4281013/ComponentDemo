package com.pactera.modulegold.mvp.contract;

import android.app.Activity;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.pactera.modulegold.mvp.model.entity.GoldBaseResponse;
import com.pactera.modulegold.mvp.model.entity.GoldListBean;

import java.util.List;

import io.reactivex.Observable;

public interface GoldHomeContract {
    interface View extends IView{
        void startLoadMore();
        void endLoadMore();
        Activity getActivity();
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,如是否使用缓存
   interface  Model extends IModel{
        Observable<GoldBaseResponse<List<GoldListBean>>> getGoldList(String type,int num, int page);
    }

}
