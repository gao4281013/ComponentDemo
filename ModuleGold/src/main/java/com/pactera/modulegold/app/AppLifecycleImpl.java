package com.pactera.modulegold.app;

import android.app.Application;
import android.content.Context;

import com.jess.arms.base.delegate.AppLifecycles;
import com.jess.arms.utils.ArmsUtils;
import com.pactera.commonsdk.BuildConfig;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import me.jessyan.retrofiturlmanager.RetrofitUrlManager;

import static com.pactera.modulegold.mvp.model.api.Api.GOLD_DOMAIN;
import static com.pactera.modulegold.mvp.model.api.Api.GOLD_DOMAIN_NAME;

public class AppLifecycleImpl implements AppLifecycles {
    @Override
    public void attachBaseContext(Context base) {

    }

    @Override
    public void onCreate(Application application) {
        if (LeakCanary.isInAnalyzerProcess(application)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        //使用 RetrofitUrlManager 切换 BaseUrl
        RetrofitUrlManager.getInstance().putDomain(GOLD_DOMAIN_NAME, GOLD_DOMAIN);
        //当所有模块集成到宿主 App 时, 在 App 中已经执行了以下代码
        if (BuildConfig.IS_BUILD_MODULE) {
            //leakCanary内存泄露检查
            ArmsUtils.obtainAppComponentFromContext(application).extras().put(RefWatcher.class.getName(), BuildConfig.USE_CANARY ? LeakCanary.install(application) : RefWatcher.DISABLED);
        }
    }

    @Override
    public void onTerminate(Application application) {

    }
}
