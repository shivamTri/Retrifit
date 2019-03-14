package com.example.savedata;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryAdapterRecycleView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Country> countryArrayList;

    public CountryAdapterRecycleView(final ArrayList<Country> countries) {
        this.countryArrayList = countries;
    }

    /**
     * This method used to create view and inflate xml file and return StudentViewHolder Object
     *
     * @param viewGroup
     * @param i
     * @return studentViewHolder
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.country, viewGroup, false);
        StudentViewHolder studentViewHolder = new StudentViewHolder(view);
        return studentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Country std = countryArrayList.get(i);
        String title = std.getName();
        ((StudentViewHolder) viewHolder).mTextViewName.setText(title);


    }

    @Override
    public int getItemCount() {
        return countryArrayList.size();
    }





        /*
         * inner class for viewHolder
         * used set id to textview and also used set Onclicklistener
         */
        class StudentViewHolder extends RecyclerView.ViewHolder {
            private TextView mTextViewName;

            public StudentViewHolder(@NonNull View itemView) {
                super(itemView);

//set ids to both textview
                mTextViewName = itemView.findViewById(R.id.tv_country);

//setting OnclickListener to item

            }
        }
    }


