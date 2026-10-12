package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import li.k;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class j {
    public final i a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new h(uri, clipDescription, uri2);
        } else {
            this.a = new k(uri, clipDescription, uri2, 29);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public j(h hVar) {
        this.a = hVar;
    }
}
