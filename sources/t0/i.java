package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class i {
    public final h a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new g(uri, clipDescription, uri2);
        } else {
            this.a = new la.h(uri, clipDescription, uri2, 27);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public i(g gVar) {
        this.a = gVar;
    }
}
