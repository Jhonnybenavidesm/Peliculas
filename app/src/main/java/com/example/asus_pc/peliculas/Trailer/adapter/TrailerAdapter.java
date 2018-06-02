package com.example.asus_pc.peliculas.Trailer.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus_pc.peliculas.R;
import com.example.asus_pc.peliculas.Trailer.model.Trailer;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class TrailerAdapter extends PagerAdapter{
    List<Trailer> trailerList;
    Context context;
    LayoutInflater layoutInflater;

    public TrailerAdapter(List<Trailer> trailerList, Context context) {
        this.trailerList = trailerList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return trailerList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Trailer object = trailerList.get(position);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_trailer, null);

        ImageView imageView = view.findViewById(R.id.id_img_trailer_image);
        TextView textViewTitle = view.findViewById(R.id.id_txv_trailer_title);
        TextView textViewSubTitle = view.findViewById(R.id.id_txv_trailer_subtitle);

        Picasso.get().load(object.getUrl_news()).into(imageView);
        textViewTitle.setText(object.getTitle());
        textViewSubTitle.setText(object.getSubtitle());

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
