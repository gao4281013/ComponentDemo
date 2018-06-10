package com.pactera.modulegold.component.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.pactera.commonsdk.core.RouterHub;
import com.pactera.commonservice.gold.bean.GoldInfo;
import com.pactera.commonservice.gold.service.GoldInfoService;

@Route(path = RouterHub.GANK_SERVICE_GANKINFOSERVICE,name = "干货集中营信息服务")
public class GoldInfoServiceImpl  implements GoldInfoService{
    private Context context;
    @Override
    public GoldInfo getInfo() {
        return new GoldInfo("干货集中营");
    }

    @Override
    public void init(Context context) {
       this.context = context;
    }
}
