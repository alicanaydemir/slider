package ir.apend.slider.ui.image;

public class ImageLoaderProvider {

    private static ImageLoader loader;

    public static void setLoader(ImageLoader loader) {
        ImageLoaderProvider.loader = loader;
    }

    public static ImageLoader getImageLoader() {
        return loader;
    }

}
