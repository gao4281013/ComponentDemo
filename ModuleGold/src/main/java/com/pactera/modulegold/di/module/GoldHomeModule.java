package com.pactera.modulegold.di.module;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jess.arms.di.scope.ActivityScope;
import com.pactera.modulegold.mvp.contract.GoldHomeContract;
import com.pactera.modulegold.mvp.model.GoldModel;
import com.pactera.modulegold.mvp.model.entity.GoldListBean;

import java.util.ArrayList;
import java.util.List;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class GoldHomeModule {

    @Binds
    abstract GoldHomeContract.Model bindGoldModel(GoldModel goldModel);

    @ActivityScope
    @Provides
    static RecyclerView.LayoutManager provideLayoutManager(GoldHomeContract.View view) {
        return new LinearLayoutManager(view.getActivity());
    }

    @ActivityScope
    @Provides
    static List<GoldListBean> provideList(){
        return new ArrayList<>();
    }

    @ActivityScope
    @Provides
    static RecyclerView.Adapter provideGoldHomeAdapter(GoldHomeContract.View goldHomeView,List<GoldListBean> list){


    }

}
