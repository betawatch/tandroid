package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class r {
    public final q a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new p(nestedScrollView);
        } else {
            this.a = new w7.s(22);
        }
    }
}
