package com.chemwater.hwweek4day3.model.datasource.remote;

import android.util.Log;

import com.chemwater.hwweek4day3.model.user.GitResponse ;

import io.reactivex.Observable ;
import io.reactivex.Observer ;
import io.reactivex.disposables.Disposable ;

//Observer subscriber pattern
//Observer, Observable, Scheduler, Emmitter

public class GitResponseObserver implements Observer<GitResponse> {

    //list
    private static final String TAG = "TAG_OBSERVER" ;
    GitResponse returnGitResponse ;
    GitResponseCallback gitResponseCallback ;

    public GitResponseObserver(GitResponseCallback gitResponseCallback) {
        this.gitResponseCallback = gitResponseCallback ;
    }

    @Override
    public  void onSubscribe(Disposable d) {
        //When the observer subscribes to the observable, do anything
        //needed to set up for the response once once it is received
        Log.d(TAG, "onSubscribe: SUBSCRIBED TO OBSERVABLE") ;
    }

    @Override
    public void onNext(GitResponse gitResponse) {
        //This is where our responses will be received
        Log.d(TAG, "onNext: RESPONSE RECEIVED") ;
        returnGitResponse = gitResponse ;
    }

    @Override
    public void onError(Throwable e) {
        //Something went wrong, take some action
        Log.e(TAG, "onError: ERROR RETURNED", e ) ;
    }

    //If we are building a list and our observer is doing multiple calls
    @Override
    public void onComplete() {
        //return list
        Log.d(TAG, "onComplete: TASK IS COMPLETE RETURNING GIT RESPONSE") ;
        //pass the user response that was received back along the callback
        gitResponseCallback.OnSuccess(returnGitResponse) ;
    }

}
