package v7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class z {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z10 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i10 != 6) {
                return -2;
            }
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        }
        return (int) fraction;
    }
}
