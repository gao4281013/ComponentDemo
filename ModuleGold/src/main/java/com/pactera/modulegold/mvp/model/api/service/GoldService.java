package com.pactera.modulegold.mvp.model.api.service;

import com.pactera.modulegold.mvp.model.entity.GoldBaseResponse;
import com.pactera.modulegold.mvp.model.entity.GoldListBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import static com.pactera.modulegold.mvp.model.api.Api.GOLD_DOMAIN_NAME;
import static me.jessyan.retrofiturlmanager.RetrofitUrlManager.DOMAIN_NAME_HEADER;

public interface GoldService {
    /**
     * 文章列表
     * */
    @Headers({DOMAIN_NAME_HEADER + GOLD_DOMAIN_NAME})
    @GET("/1.1/classes/Entry")
    Observable<GoldBaseResponse<List<GoldListBean>>> getGoldList(@Header("X-LC-Id") String id,
                                                                 @Header("X-LC-Sign") String sign,
                                                                 @Query("where") String where,
                                                                 @Query("order") String order,
                                                                 @Query("include") String include,
                                                                 @Query("limit") int limit,
                                                                 @Query("skip") int skip);

}
