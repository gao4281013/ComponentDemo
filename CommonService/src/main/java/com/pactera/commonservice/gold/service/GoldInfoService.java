package com.pactera.commonservice.gold.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.pactera.commonservice.gold.bean.GoldInfo;

public interface GoldInfoService extends IProvider {
    GoldInfo getInfo();
}
