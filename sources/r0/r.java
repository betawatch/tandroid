package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r {
    public final q a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new p(nestedScrollView);
        } else {
            this.a = new jb.b(18);
        }
    }
}
