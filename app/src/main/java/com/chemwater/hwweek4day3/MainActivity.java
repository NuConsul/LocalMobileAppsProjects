package com.chemwater.hwweek4day3;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.chemwater.hwweek4day3.model.user.GitResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    FirstFragment firstFragment ;
    SecondFragment secondFragment ;
    FragmentManager fragmentManager ;


    RecyclerView recyclerView;
    MyRecyclerViewAdapter myRecyclerViewAdapter;

    private static final String DYNAMIC_FRAG_ONE_TAG = "dynamic_frag_one";
    private static final String DYNAMIC_FRAG_TWO_TAG = "dynamic_frag_two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;

        firstFragment = FirstFragment.newInstance() ;
        secondFragment = SecondFragment.newInstance() ;
        //Fragment manager
        fragmentManager = getSupportFragmentManager() ;

        //use fragment manager to begin fragment transaction, replace the frag in layout with the
        //fragment we want there, add it to back stack with a tag, and commit the transaction
        fragmentManager
                .beginTransaction()
                .replace(R.id.firstFragment, FirstFragment.newInstance())
                .addToBackStack(DYNAMIC_FRAG_ONE_TAG)
                .commit() ;


        fragmentManager
                .beginTransaction()
                .replace(R.id.secondFragment, SecondFragment.newInstance())
                .addToBackStack(DYNAMIC_FRAG_TWO_TAG)
                .commit() ;


        //RetrofitHelper retrofitHelper = new RetrofitHelper();
        //Start Retrofit in a async way to get our pojo response




        //Bind RecyclerView
        recyclerView = findViewById(R.id.rvRecyclerView);

        //Recycler View needs 2 items
        //  1. Layout Manager (Can be customized, but we generally us a default
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);





        //  2.RecyclerView adapter (We write this)
        myRecyclerViewAdapter = new MyRecyclerViewAdapter(generateListOfGitUsers());
        recyclerView.setAdapter(myRecyclerViewAdapter);

    }




    private ArrayList<GitResponse> generateListOfGitUsers() {
        ArrayList<GitResponse> gitResponsesArrayList = new ArrayList<>();
        gitResponsesArrayList.add(new GitResponse()) ;
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());
        gitResponsesArrayList.add(new GitResponse());

        return gitResponsesArrayList ;
    }

}
