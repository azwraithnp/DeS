package com.azwraith.apps.des;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    TextView news, videos, tournaments, events, pet;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PTN57F.ttf");

        news = (TextView)view.findViewById(R.id.news);
        videos = (TextView)view.findViewById(R.id.videos);
        tournaments = (TextView)view.findViewById(R.id.tournaments);
        events = (TextView)view.findViewById(R.id.events);
        pet = (TextView)view.findViewById(R.id.pet);

        news.setTypeface(tf, Typeface.BOLD);
        videos.setTypeface(tf, Typeface.BOLD);
        tournaments.setTypeface(tf, Typeface.BOLD);
        events.setTypeface(tf, Typeface.BOLD);
        pet.setTypeface(tf, Typeface.BOLD);

        return view;

    }

}
