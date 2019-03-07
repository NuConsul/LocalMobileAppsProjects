package com.chemwater.hwweek4day3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import com.chemwater.hwweek4day3.model.user.GitResponse;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private static final String IMAGE_URL = "";
    //List of beverages that will be populated into the recycler view
    ArrayList<GitResponse> gitResponsesArrayList;

    //Constructor for the Adapter
    public MyRecyclerViewAdapter(ArrayList<GitResponse> gitResponsesArrayList) {
        this.gitResponsesArrayList = gitResponsesArrayList;
    }

    //Inflate the xml into active memeory (renders)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        //return new instance of the viewholder( We need to inflate(render) the view to passing
        //                                           by telling the context of where this is going
        //                                           to be rendered, the layout to inflate, the viewgroup
        //                                            to  assign it to, and if we need a root level attachment)
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.git_item, viewGroup, false));
    }

    // Once we have the viewholder, we then populated the data when we bind to the created viewholder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        //Get the item's information which we wish to populate for that viewholder
        GitResponse currentGitResponsesBeingPopulated = gitResponsesArrayList.get(position);
        //use the passed viewholder to access the items view and populate
        viewHolder.tvEmail.setText(currentGitResponsesBeingPopulated.getEmailsUrl());
        viewHolder.tvEmoji.setText(currentGitResponsesBeingPopulated.getEmojisUrl());
        viewHolder.tvEvent.setText(currentGitResponsesBeingPopulated.getEventsUrl());
        viewHolder.tvFeed.setText(currentGitResponsesBeingPopulated.getFeedsUrl());

        //Using glide to associate the web resourced image to our imageView
        /*
        Glide
                .with(viewHolder.itemView.getContext())
                .load("https://images.freeimages.com/images/large-previews/25d/eagle-1523807.jpg")
                .into(viewHolder.imgMeme);*/


        Log.d("TAG", "onBindViewHolder: item being rendered = " + position);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), beveragesArrayList.get(position).getName() + "clicked", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                bundle.putParcelable("bev", gitResponsesArrayList.get(position));
            }
        });
    }

    //Add to list, notify the adapter that the info in the list has changed
    public void addGetResponseToList(GitResponse gitResponse) {
        gitResponsesArrayList.add(gitResponse);
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return gitResponsesArrayList.size();
    }


    //Inner class view container.  This container holds the views that we will use for each item.
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvEmail, tvEmoji, tvEvent, tvFeed ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvEmail = itemView.findViewById(R.id.firstFieldSecondFrag) ;
            tvEmoji = itemView.findViewById(R.id.secondFieldSecondFrag) ;
            tvEvent = itemView.findViewById(R.id.thirdFieldSecondFrag) ;
            tvFeed = itemView.findViewById(R.id.fourthFieldSecondFrag) ;
        }
    }
}
