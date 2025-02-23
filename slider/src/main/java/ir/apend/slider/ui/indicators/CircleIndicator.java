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
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_round_unselected, null));
        } else {
            setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_round_unselected));
        }
    }

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_round_selected, null));
            } else {
                setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_round_selected));
            }
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_round_unselected, null));
            } else {
                setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_round_unselected));
            }
        }
    }
}
