// default package

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qu9 {
    public final pu9 a;

    public qu9(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new ou9(nestedScrollView);
        } else {
            this.a = new faf((byte) 25);
        }
    }
}
