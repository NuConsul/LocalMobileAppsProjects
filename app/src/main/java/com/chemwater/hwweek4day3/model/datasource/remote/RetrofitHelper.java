package com.chemwater.hwweek4day3.model.datasource.remote;

import com.chemwater.hwweek4day3.model.user.GitResponse ;

import io.reactivex.Observable ;
import okhttp3.OkHttpClient ;
import okhttp3.logging.HttpLoggingInterceptor ;
import retrofit2.Retrofit ;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory ;
import retrofit2.converter.gson.GsonConverterFactory ;
import retrofit2.http.GET ;
import retrofit2.http.Query ;

public class RetrofitHelper {

    private static Retrofit getRetrofit() {
        //Build retrofit instance
        return new Retrofit
                .Builder()
                .baseUrl(ApiConstants.BASE_URL) // Base URL of the api source
                .addConverterFactory(GsonConverterFactory.create()) //add object converter factory
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build() ; //build the instance
    }

    //create the interface instance in retrofit
    private ObservableInterface createUserResponseInterface() {
        return getRetrofit().create(ObservableInterface.class) ;
    }

    //Execute rest call
    public Observable<GitResponse> getUserResponseObservable(String numResults) {
        return createUserResponseInterface().getUserResponseObservable(numResults) ;
    }

    //Interface for the observable
    public interface ObservableInterface {
        @GET(ApiConstants.PATH_API)
        Observable<GitResponse> getUserResponseObservable(
                @Query(ApiConstants.QUERY_RESULTS) String numOfResultsDesired) ;
    }

}