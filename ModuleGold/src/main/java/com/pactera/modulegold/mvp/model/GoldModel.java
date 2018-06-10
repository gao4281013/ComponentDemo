package com.pactera.modulegold.mvp.model;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.pactera.modulegold.app.GoldConstants;
import com.pactera.modulegold.mvp.contract.GoldHomeContract;
import com.pactera.modulegold.mvp.model.api.service.GoldService;
import com.pactera.modulegold.mvp.model.entity.GoldBaseResponse;
import com.pactera.modulegold.mvp.model.entity.GoldListBean;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

@ActivityScope
public class GoldModel extends BaseModel implements GoldHomeContract.Model{
    @Inject
    public GoldModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public Observable<GoldBaseResponse<List<GoldListBean>>> getGoldList(String type, int num, int page) {
        return mRepositoryManager
                .obtainRetrofitService(GoldService.class)
                .getGoldList(GoldConstants.LEANCLOUD_ID,
                        GoldConstants.LEANCLOUD_SIGN,
                        "{\"category\":\"" + type + "\"}",
                        "-createdAt",
                        "user,user.installation",num,page*num);
    }
}
