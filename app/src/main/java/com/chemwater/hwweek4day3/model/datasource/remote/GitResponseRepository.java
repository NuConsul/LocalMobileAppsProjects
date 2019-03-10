package com.chemwater.hwweek4day3.model.datasource.remote;

import io.reactivex.Scheduler ;
import io.reactivex.android.schedulers.AndroidSchedulers ;
import io.reactivex.schedulers.Schedulers ;
import retrofit2.Retrofit ;

//Where we will set up subscriptions for the Observable
public class GitResponseRepository {
    private RetrofitHelper retrofitHelper ;

    public GitResponseRepository() {
        this.retrofitHelper = new RetrofitHelper() ;
    }

    //Subscribe to observable and schedule the threads
    public void getUserResponse(String results, GitResponseCallback gitResponseCallback) {
        retrofitHelper.getUserResponseObservable(results)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new GitResponseObserver(gitResponseCallback)) ;
    }

}