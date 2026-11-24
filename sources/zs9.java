// default package

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zs9 {
    public final ys9 a;

    public zs9(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new xs9(nestedScrollView);
        } else {
            this.a = new q7f((byte) 25);
        }
    }
}
