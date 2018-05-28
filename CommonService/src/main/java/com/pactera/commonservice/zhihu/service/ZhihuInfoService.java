package com.pactera.commonservice.zhihu.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.pactera.commonservice.zhihu.bean.ZhihuInfo;

public interface ZhihuInfoService extends IProvider {
    ZhihuInfo getInfo();
}
