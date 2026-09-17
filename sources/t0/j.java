package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m2.t;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class j {
    public final i a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new h(uri, clipDescription, uri2);
        } else {
            this.a = new t(uri, clipDescription, uri2, 24);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public j(h hVar) {
        this.a = hVar;
    }
}
