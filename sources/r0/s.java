package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s {
    public final r a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new q(nestedScrollView);
        } else {
            this.a = new qb.b(20);
        }
    }
}
