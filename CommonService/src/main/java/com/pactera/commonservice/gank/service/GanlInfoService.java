package com.pactera.commonservice.gank.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.pactera.commonservice.gank.bean.GankInfo;

public interface GanlInfoService extends IProvider {
    GankInfo getInfo();
}
