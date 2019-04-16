package ir.apend.slider.ui;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ir.apend.slider.ui.image.ImageLoader;

public class PicassoLoader implements ImageLoader {
    @Override
    public void load(String url, ImageView imageView) {
        Picasso.get().cancelRequest(imageView);
        Picasso.get().load(url).into(imageView);
    }
}
