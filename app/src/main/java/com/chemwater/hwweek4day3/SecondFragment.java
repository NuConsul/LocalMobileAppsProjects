package com.chemwater.hwweek4day3;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chemwater.hwweek4day3.model.datasource.remote.GitResponseCallback;
import com.chemwater.hwweek4day3.model.datasource.remote.GitResponseRepository;
import com.chemwater.hwweek4day3.model.user.GitResponse;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements GitResponseCallback {

    TextView firstView, secondView, thirdView, fourthView ;
    RecyclerView recyclerView;

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;

        GitResponseRepository gitResponseRepository = new GitResponseRepository() ;
        gitResponseRepository.getUserResponse("5", this) ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        firstView = view.findViewById(R.id.firstFieldSecondFrag) ;
        secondView = view.findViewById(R.id.secondFieldSecondFrag) ;
        thirdView = view.findViewById(R.id.thirdFieldSecondFrag) ;
        fourthView = view.findViewById(R.id.fourthFieldSecondFrag) ;
    }


    @Override
    public void OnSuccess(GitResponse gitResponse) {
        initalizeRecyclerView(gitResponse) ;
    }

    private void initalizeRecyclerView(GitResponse gitResponse) {
        recyclerView = getView().findViewById(R.id.rvRecyclerView) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext())) ;
        recyclerView.setAdapter(new MyRecyclerViewAdapter(gitResponse)) ;
    }


}
