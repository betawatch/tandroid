package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r {
    public final q a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new p(nestedScrollView);
        } else {
            this.a = new pb.b(22);
        }
    }
}
