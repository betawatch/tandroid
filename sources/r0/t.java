package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t {
    public final s a;

    public t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new r(nestedScrollView);
        } else {
            this.a = new d7.u(22);
        }
    }
}
