// default package

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
