// default package

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class roe {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i != 6) {
                return -2;
            }
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i2, i2);
        }
        return (int) fraction;
    }
}
