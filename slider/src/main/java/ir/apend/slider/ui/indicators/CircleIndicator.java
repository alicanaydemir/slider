package ir.apend.slider.ui.indicators;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;

import ir.apend.sliderlibrary.R;


/**
 * @author S.Shahini
 * @since 11/27/16
 */

public class CircleIndicator extends IndicatorShape {

    public CircleIndicator(Context context, int indicatorSize, boolean mustAnimateChanges) {
        super(context, indicatorSize, mustAnimateChanges);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_unselected_gray, null));
        } else {
            setBackgroundDrawable(getResources().getDrawable(R.drawable.indicator_circle_unselected_gray));
        }
    }

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_selected_purple, null));
            } else {
                setBackgroundDrawable(getResources().getDrawable(R.drawable.indicator_circle_selected_purple));
            }
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_unselected_gray, null));
            } else {
                setBackgroundDrawable(getResources().getDrawable(R.drawable.indicator_circle_unselected_gray));
            }
        }
    }
}
