package com.example.asus_pc.peliculas.Trailer.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asus_pc.peliculas.R;
import com.example.asus_pc.peliculas.Trailer.adapter.TrailerAdapter;
import com.example.asus_pc.peliculas.Trailer.model.Trailer;
import com.example.asus_pc.peliculas.Trailer.presenter.TrailerFragmentPresenter;
import com.example.asus_pc.peliculas.Trailer.presenter.TrailerFragmentPresenterImpl;
import com.squareup.picasso.Picasso;

import java.util.List;


public class TrailerFragment extends Fragment implements TrailerFragmentView{

    private TrailerFragmentPresenter trailerFragmentPresenter;
    ViewPager viewPager;
    ImageView imageViewVideo;

    public TrailerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trailer, container, false);

        viewPager = view.findViewById(R.id.id_vp_trailer);
        imageViewVideo = view.findViewById(R.id.id_img_video);
        Picasso.get().load("http://www.rockandpop.cl/wp-content/uploads/2018/03/landscape-1500890190-avengers-infinity-war-poster-resized-1.jpg").into(imageViewVideo);
        trailerFragmentPresenter = new TrailerFragmentPresenterImpl(this);
        trailerFragmentPresenter.getDataTrailer();

        return view;
    }

    @Override
    public void getDataTrailer() {
        trailerFragmentPresenter.getDataTrailer();
    }

    @Override
    public void showResultTrailer(List<Trailer> trailerList) {
        viewPager.setAdapter(new TrailerAdapter(trailerList, getContext()));
    }
}
