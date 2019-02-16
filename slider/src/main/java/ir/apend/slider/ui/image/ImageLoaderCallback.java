package ir.apend.slider.ui.image;

import android.graphics.Bitmap;

public interface ImageLoaderCallback {

    void onLoad(Bitmap bitmap);

    void onError(Throwable error);
}
